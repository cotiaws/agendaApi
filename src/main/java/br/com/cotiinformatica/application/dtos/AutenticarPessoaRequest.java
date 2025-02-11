package br.com.cotiinformatica.application.dtos;

import lombok.Data;

@Data
public class AutenticarPessoaRequest {

	private String email;
	private String senha;
}
