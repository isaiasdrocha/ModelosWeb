package br.com.isaiasdrocha.model;

import br.com.isaiasdrocha.enums.EnumTipoEndereco;

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
	private EnumTipoEndereco tipoEndereco;
	
	/*********************************/
	/********** FOREING KEY **********/
	/*********************************/
	private Cidade cidade;
	
	private Uf uf;
	
	private Nacionalidade nacionalidade;
}