package br.com.isaiasdrocha.repository;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;

@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class PessoaRepository {
	
	public String voltarTeste(){
		return "Acesso realizado com sucesso";
	}

}