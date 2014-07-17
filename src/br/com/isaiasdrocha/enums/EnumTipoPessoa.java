package br.com.isaiasdrocha.enums;

public enum EnumTipoPessoa {

	FISICA("Fisica"),
	JURIDICA("Juridica");
	
	private String descricao;
	
	private EnumTipoPessoa(String descricao){
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
}