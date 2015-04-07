package br.com.ecommerce.modelo.enuns;

public enum EnumStatus {

	ATIVO(1, "ativo"),

	INATIVO(2, "inativo");

	private int codigo;

	private String descricao;

	private EnumStatus(final int codigo, final String descricao) {

		this.codigo = codigo;

		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
