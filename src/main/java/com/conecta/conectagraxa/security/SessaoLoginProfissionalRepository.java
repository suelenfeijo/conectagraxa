package com.conecta.conectagraxa.security;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface SessaoLoginProfissionalRepository extends JpaRepository<SessaoLoginProfissional, Integer>{

	//pesquisa se na tabela SessaoLoginProfissional existe o email informado.
	Optional<SessaoLoginProfissional> findByEmail(String email);
	
	//pesquisa se na tabela SessaoLoginProfissional existe o token informado.
	
//	@Query("select p.token from profissional p where p.id = :id")
//	Optional<Profissional> findByToken(@Param("id") Long id);
	
	Optional<SessaoLoginProfissional> findByToken(String string);
	
	Optional<String> findTokenById(@Param("id") Integer id);

	SessaoLoginProfissional findByLogado(boolean b);

}