package br.com.isaiasdrocha.service;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

import br.com.isaiasdrocha.repository.PessoaRepository;

@Service
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class PessoaService implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1309703498898223922L;

	@Autowired
	private PessoaRepository pessoaRepository;
	
	public void teste(){
		System.out.println(pessoaRepository.voltarTeste());
	}
	
}