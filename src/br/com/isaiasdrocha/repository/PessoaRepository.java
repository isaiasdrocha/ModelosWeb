package br.com.isaiasdrocha.repository;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;

import br.com.isaiasdrocha.model.Pessoa;

@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class PessoaRepository implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7624214366841294254L;

	
	public String voltarTeste(){
		return "Acesso realizado com sucesso";
	}

}