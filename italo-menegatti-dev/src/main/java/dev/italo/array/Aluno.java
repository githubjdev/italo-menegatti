package dev.italo.array;

public class Aluno {

	private String nome;
	private int idade;

	public Aluno(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String dados() {
		return this.nome + " - " + idade;
	}

	@Override
	public String toString() {
		return dados();
	}
	
	
	

}
