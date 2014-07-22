package br.com.isaiasdrocha.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Nacionalidade implements Serializable {
	
	/*****************************************************************/
	/*************************** ATRIBUTOS ***************************/
	/*****************************************************************/
	private static final long serialVersionUID = 3811161372211854483L;

	@Id
	@GeneratedValue
	private long id;
	
	private String nacionalidade;

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
}
