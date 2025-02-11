package br.com.cotiinformatica.infrastructure.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cotiinformatica.application.dtos.TarefaRequest;
import br.com.cotiinformatica.application.dtos.TarefaResponse;

@RestController
@RequestMapping("/api/v1/agenda")
public class AgendaController {

	@PostMapping("criar-tarefa")
	public ResponseEntity<TarefaResponse> criarTarefa(@RequestBody TarefaRequest request) {
		// TODO
		return null;
	}

	@PutMapping("editar-tarefa/{id}")
	public ResponseEntity<TarefaResponse> editarTarefa(@PathVariable UUID id, @RequestBody TarefaRequest request) {
		// TODO
		return null;
	}

	@DeleteMapping("excluir-tarefa/{id}")
	public ResponseEntity<TarefaResponse> excluirTarefa(@PathVariable UUID id) {
		// TODO
		return null;
	}
	
	@GetMapping("listar-tarefas/{dataMin}/{dataMax}")
	public ResponseEntity<List<TarefaResponse>> consultarTarefas(@PathVariable String dataMin, @PathVariable String dataMax) {
		// TODO
		return null;
	}
	
	@GetMapping("obter-tarefa/{id}")
	public ResponseEntity<TarefaResponse> consultarTarefa(@PathVariable UUID id) {
		// TODO
		return null;
	}
	
}
