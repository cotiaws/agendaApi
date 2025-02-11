package br.com.cotiinformatica.application.ports.out;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.cotiinformatica.domain.models.Tarefa;

@Repository
public interface TarefaRepository extends JpaRepository<Tarefa, UUID>{

	@Query("from Tarefa t where t.dataHora >= :dataMin and t.dataHora <= :dataMax and t.pessoa.id = :pessoaId")
	List<Tarefa> find(
			@Param("dataMin") Date dataMin,
			@Param("dataMax") Date dataMax,
			@Param("pessoaId") UUID pessoaId
			);
}
