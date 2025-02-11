package br.com.cotiinformatica.infrastructure.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cotiinformatica.application.dtos.CriarPessoaRequest;
import br.com.cotiinformatica.application.dtos.CriarPessoaResponse;
import br.com.cotiinformatica.application.ports.in.PessoaService;

@RestController
@RequestMapping("/api/v1/pessoas")
public class PessoaController {

	@Autowired PessoaService pessoaService;
	
	@PostMapping("cadastrar")
	public ResponseEntity<CriarPessoaResponse> cadastrar(@RequestBody CriarPessoaRequest request) {
		var response = pessoaService.criar(request);
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
	}

}
