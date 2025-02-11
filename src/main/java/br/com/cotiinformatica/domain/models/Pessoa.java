package br.com.cotiinformatica.domain.models;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Pessoa {

	@Id
	@Column
	private UUID id;

	@Column(length = 150, nullable = false)
	private String nome;

	@Column(length = 100, nullable = false, unique = true)
	private String email;

	@Column(length = 100, nullable = false)
	private String senha;
	
	@OneToMany(mappedBy = "pessoa")
	private List<Tarefa> tarefas;
}
