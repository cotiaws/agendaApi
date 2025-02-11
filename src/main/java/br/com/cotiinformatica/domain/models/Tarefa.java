package br.com.cotiinformatica.domain.models;

import java.util.Date;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Entity
@Data
public class Tarefa {

	@Id
	@Column
	private UUID id;

	@Column(length = 150, nullable = false)
	private String nome;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date dataHora;

	@Column(nullable = false)
	private Integer prioridade;

	@Column(nullable = false)
	private Integer status;

	@ManyToOne
	@JoinColumn(name = "pessoa_id", nullable = false)
	private Pessoa pessoa;
}
