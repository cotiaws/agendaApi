package br.com.cotiinformatica.application.ports.in;

import br.com.cotiinformatica.application.dtos.AutenticarPessoaRequest;
import br.com.cotiinformatica.application.dtos.AutenticarPessoaResponse;
import br.com.cotiinformatica.application.dtos.CriarPessoaRequest;
import br.com.cotiinformatica.application.dtos.CriarPessoaResponse;

public interface PessoaService {

	CriarPessoaResponse criar(CriarPessoaRequest request);

	AutenticarPessoaResponse autenticar(AutenticarPessoaRequest request);
}
