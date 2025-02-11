package br.com.cotiinformatica.application.dtos;

import lombok.Data;

@Data
public class CriarPessoaRequest {

	private String nome;
	private String email;
	private String senha;
}
