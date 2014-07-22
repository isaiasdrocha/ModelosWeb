package br.com.isaiasdrocha.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Municipio implements Serializable{
	
	/*****************************************************************/
	/*************************** ATRIBUTOS ***************************/
	/*****************************************************************/
	private static final long serialVersionUID = 2089776382005526578L;

	@Id
	@GeneratedValue
	private long id;
	
	private Integer codigoMunicipal;
	
	private Integer codigoFederal;
	
	private Integer codigoIBGE;

	private String descricao;
	
	/*********************************/
	/********** FOREING KEY **********/
	/*********************************/
	@ManyToOne
	@JoinColumn(name="fk_uf",foreignKey=@ForeignKey(name="ck_municipio_uf"))
	private UF uf;
	
	/*********************************/
	/************* ENUNS *************/
	/*********************************/
	
	/***********************************************/
	/************* GETTERS AND SETTERS *************/
	/***********************************************/	
	public Integer getCodigoMunicipal() {
		return codigoMunicipal;
	}

	public void setCodigoMunicipal(Integer codigoMunicipal) {
		this.codigoMunicipal = codigoMunicipal;
	}

	public Integer getCodigoFederal() {
		return codigoFederal;
	}

	public void setCodigoFederal(Integer codigoFederal) {
		this.codigoFederal = codigoFederal;
	}

	public Integer getCodigoIBGE() {
		return codigoIBGE;
	}

	public void setCodigoIBGE(Integer codigoIBGE) {
		this.codigoIBGE = codigoIBGE;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public UF getUf() {
		return uf;
	}

	public void setUf(UF uf) {
		this.uf = uf;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
