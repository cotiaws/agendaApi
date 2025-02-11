package br.com.cotiinformatica.infrastructure.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cotiinformatica.application.dtos.AutenticarPessoaRequest;
import br.com.cotiinformatica.application.dtos.AutenticarPessoaResponse;

@RestController
@RequestMapping("/api/v1/login")
public class LoginController {

	@PostMapping("autenticar")
	public ResponseEntity<AutenticarPessoaResponse> autenticar(@RequestBody AutenticarPessoaRequest request) {
		// TODO
		return null;
	}
}
