package br.com.isaiasdrocha.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.com.isaiasdrocha.enums.EnumTipoEndereco;

@Entity
public class Endereco {

	/*********************************/
	/************ ATRIBUTOS ***********/
	/*********************************/	
	private String logradouro;
	
	private Integer numero;
	
	private String bairro;
	
	private String cep;
	
	/*********************************/
	/************* ENUNS *************/
	/*********************************/
	@Enumerated(EnumType.STRING)
	@Column(length = 60)
	private EnumTipoEndereco tipoEndereco;
	
	/*********************************/
	/********** FOREING KEY **********/
	/*********************************/
	@ManyToOne
	@JoinColumn(name="fk_municipio",foreignKey=@ForeignKey(name="ck_endereco_municipio"))
	private Municipio municipio;
	
	@ManyToOne
	@JoinColumn(name="fk_nacionalidade",foreignKey=@ForeignKey(name="ck_endereco_nacionalidade"))
	private Nacionalidade nacionalidade;
	
	/***********************************************/
	/************* GETTERS AND SETTERS *************/
	/***********************************************/	
	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public EnumTipoEndereco getTipoEndereco() {
		return tipoEndereco;
	}

	public void setTipoEndereco(EnumTipoEndereco tipoEndereco) {
		this.tipoEndereco = tipoEndereco;
	}

	public Municipio getMunicipio() {
		return municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}

	public Nacionalidade getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(Nacionalidade nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
}