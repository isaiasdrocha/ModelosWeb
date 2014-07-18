package br.com.isaiasdrocha.controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import br.com.isaiasdrocha.service.PessoaService;

@ManagedBean(name = "pessoaController")
@ViewScoped
public class PessoaController  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 764693509311660129L;
	
	@ManagedProperty("#{pessoaRepository}")
	private PessoaService pessoaService;

	public void teste(){
		pessoaService.teste();
	}
	
	
	/*********************************************************/
	/****************** GETTERS AND SETTERS ******************/
	/*********************************************************/
	public void setPessoaService(PessoaService pessoaService) {
		this.pessoaService = pessoaService;
	}
	
	
}