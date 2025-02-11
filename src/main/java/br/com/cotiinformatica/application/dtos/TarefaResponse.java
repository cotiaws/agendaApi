package br.com.cotiinformatica.application.dtos;

import java.util.UUID;

import lombok.Data;

@Data
public class TarefaResponse {

	private UUID id;
	private String nome;
	private String dataHora;
	private Integer prioridade;
	private Integer status;
	private String nomePessoa;
	private String emailPessoa;
}
