package br.com.cotiinformatica.application.dtos;

import lombok.Data;

@Data
public class TarefaRequest {

	private String nome;
	private String dataHora;
	private Integer prioridade;
	private Integer status;
}
