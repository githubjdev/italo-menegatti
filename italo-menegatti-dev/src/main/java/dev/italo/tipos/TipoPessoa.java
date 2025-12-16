package dev.italo.tipos;

public enum TipoPessoa {

	FISICA("fisica"), JURIDICA("juridica");

	private String descricao;

	private TipoPessoa(String decricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

}
