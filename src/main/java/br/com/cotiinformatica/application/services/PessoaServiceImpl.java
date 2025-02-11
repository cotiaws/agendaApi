package br.com.cotiinformatica.application.services;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cotiinformatica.application.dtos.AutenticarPessoaRequest;
import br.com.cotiinformatica.application.dtos.AutenticarPessoaResponse;
import br.com.cotiinformatica.application.dtos.CriarPessoaRequest;
import br.com.cotiinformatica.application.dtos.CriarPessoaResponse;
import br.com.cotiinformatica.application.ports.in.PessoaService;
import br.com.cotiinformatica.application.ports.out.PessoaRepository;
import br.com.cotiinformatica.domain.models.Pessoa;
import br.com.cotiinformatica.infrastructure.components.MessageProducer;

@Service
public class PessoaServiceImpl implements PessoaService {

	@Autowired PessoaRepository pessoaRepository;
	@Autowired MessageProducer messageProducer;	

	@Override
	public CriarPessoaResponse criar(CriarPessoaRequest request) {

		if (pessoaRepository.findByEmail(request.getEmail()) != null)
			throw new IllegalArgumentException("O email informado já está cadastrado.");

		var pessoa = new Pessoa();

		pessoa.setId(UUID.randomUUID());
		pessoa.setNome(request.getNome());
		pessoa.setEmail(request.getEmail());
		pessoa.setSenha(encryptPassword(request.getSenha()));
		
		pessoaRepository.save(pessoa);		
		messageProducer.send(pessoa.toString());
		
		var response = new CriarPessoaResponse();
		
		response.setId(pessoa.getId());
		response.setNome(pessoa.getNome());
		response.setEmail(pessoa.getEmail());
		response.setDataHoraCadastro(new Date());
		
		return response;
	}

	@Override
	public AutenticarPessoaResponse autenticar(AutenticarPessoaRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	private String encryptPassword(String password) {
		try {
			var digest = MessageDigest.getInstance("SHA-1");
			var hashBytes = digest.digest(password.getBytes(StandardCharsets.UTF_8));

			var hexString = new StringBuilder();
			for (byte b : hashBytes) {
				String hex = Integer.toHexString(0xff & b);
				if (hex.length() == 1)
					hexString.append('0');
				hexString.append(hex);
			}

			return hexString.toString();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			return null;
		}
	}
}
