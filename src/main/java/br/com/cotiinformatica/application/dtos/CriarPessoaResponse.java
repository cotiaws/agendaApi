package br.com.cotiinformatica.application.dtos;

import java.util.Date;
import java.util.UUID;

import lombok.Data;

@Data
public class CriarPessoaResponse {

	private UUID id;
	private String nome;
	private String email;
	private Date dataHoraCadastro;
}
