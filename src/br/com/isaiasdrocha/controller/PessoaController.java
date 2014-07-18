package br.com.isaiasdrocha.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.isaiasdrocha.model.Pessoa;
import br.com.isaiasdrocha.service.PessoaService;

@ManagedBean(name = "pessoaController")
@ViewScoped
public class PessoaController  implements Serializable {

	/*****************************************************************/
	/*************************** ATRIBUTOS ***************************/
	/*****************************************************************/
	private static final long serialVersionUID = 764693509311660129L;
	
	@ManagedProperty("#{pessoaRepository}")
	private PessoaService pessoaService;
	
	private final Logger log = LoggerFactory.getLogger( PessoaController.class );
	
	private Pessoa pessoa;
	/*****************************************************************/
	/************************* INICIALIZACAO *************************/
	/*****************************************************************/
	@PostConstruct
	public void initialize() {
		log.info("Carregar objetos");
		pessoa = new Pessoa();
	}
	
	
	public void teste(){
		pessoaService.teste();
	}
	
	public void imprimeTela(){
		//FacesContextUtil.addMessage(Severity.WARN, MessageBundleUtil.getMessage("geral_pesquisa_sem_resultado"), null, true);
		
	}
	
	//@Transactional(propagation=Propagation.REQUIRED)
	//@Transactional(propagation=Propagation.support)
	
	
	/*********************************************************/
	/****************** GETTERS AND SETTERS ******************/
	/*********************************************************/
	public void setPessoaService(PessoaService pessoaService) {
		this.pessoaService = pessoaService;
	}


	public Pessoa getPessoa() {
		return pessoa;
	}


	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	
}