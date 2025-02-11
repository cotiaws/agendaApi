package br.com.cotiinformatica.application.services;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.cotiinformatica.application.dtos.TarefaRequest;
import br.com.cotiinformatica.application.dtos.TarefaResponse;
import br.com.cotiinformatica.application.ports.in.TarefaService;

@Service
public class TarefaServiceImpl implements TarefaService {

	@Override
	public TarefaResponse criar(TarefaRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TarefaResponse alterar(UUID id, TarefaRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TarefaResponse excluir(UUID id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TarefaResponse> consultar(Date dataMin, Date dataMax, UUID pessoaId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TarefaResponse obter(UUID id) {
		// TODO Auto-generated method stub
		return null;
	}

}
