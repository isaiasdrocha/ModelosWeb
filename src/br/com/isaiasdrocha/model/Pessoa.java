package br.com.isaiasdrocha.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import br.com.isaiasdrocha.enums.EnumTipoPessoa;

@Entity
public class Pessoa{

	/***********************/
	/****** ATRIBUTOS ******/
	/***********************/
	private String nome;
	
	/*********************************/
	/************* ENUNS *************/
	/*********************************/
	@Enumerated(EnumType.STRING)
	private EnumTipoPessoa tipoPessoa;
	
	/*********************************/
	/********** FOREING KEY **********/
	/*********************************/
	private List<Endereco> enderecos;
	
}
