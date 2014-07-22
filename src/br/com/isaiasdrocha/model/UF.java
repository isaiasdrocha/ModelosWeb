package br.com.isaiasdrocha.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UF implements Serializable{

	
	/*****************************************************************/
	/*************************** ATRIBUTOS ***************************/
	/*****************************************************************/
	private static final long serialVersionUID = 4258359493421303491L;

	@Id
	@GeneratedValue
	private long id;
	
	private Integer codigo;
	
	private String sigla;
	
	private String nome;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
}