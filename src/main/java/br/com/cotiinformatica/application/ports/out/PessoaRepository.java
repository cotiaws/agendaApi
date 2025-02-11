package br.com.cotiinformatica.application.ports.out;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.cotiinformatica.domain.models.Pessoa;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, UUID> {

	@Query("from Pessoa p where p.email = :email")
	Pessoa findByEmail(@Param("email") String email);

	@Query("from Pessoa p where p.email = :email and p.senha = :senha")
	Pessoa findByEmailAndSenha(@Param("email") String email, @Param("senha") String senha);
}
