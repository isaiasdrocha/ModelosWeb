package br.com.isaiasdrocha.enums;


public enum EnumTipoEndereco{
	
	PRINCIPAL("Principal"),
	ENTREGA("Entrega"),
	COBRANCA("Cobrança");
	
	private String descricao;
	
	private EnumTipoEndereco(String descricao){
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

}