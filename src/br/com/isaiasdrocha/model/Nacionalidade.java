package br.com.isaiasdrocha.model;

import javax.persistence.Entity;

@Entity
public class Nacionalidade {
	
	private String nacionalidade;

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
}
