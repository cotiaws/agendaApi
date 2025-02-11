package br.com.cotiinformatica.application.ports.in;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import br.com.cotiinformatica.application.dtos.TarefaRequest;
import br.com.cotiinformatica.application.dtos.TarefaResponse;

public interface TarefaService {

	TarefaResponse criar(TarefaRequest request);
	
	TarefaResponse alterar(UUID id, TarefaRequest request);
	
	TarefaResponse excluir(UUID id);
	
	List<TarefaResponse> consultar(Date dataMin, Date dataMax, UUID pessoaId);
	
	TarefaResponse obter(UUID id);
}
