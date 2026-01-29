package dev.italo.model;

public class Produto {

	private Long id;

	private String nome;
	private double valor;
	private boolean ativo;

	public Produto(String nome, double valor) {
		super();
		this.nome = nome;
		this.valor = valor;
	}

	public Produto(String nome, double valor, boolean ativo) {
		super();
		this.nome = nome;
		this.valor = valor;
		this.ativo = ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public boolean getAtivo() {
		return ativo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public double getValor() {
		return valor;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", valor=" + valor + "]";
	}

}
