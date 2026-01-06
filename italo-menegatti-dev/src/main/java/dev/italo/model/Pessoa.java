package dev.italo.model;

import java.time.LocalDate;

public class Pessoa {

	private String nome;
	private int idade;
	private LocalDate dataNascimento;

	private final String login;

	public Pessoa(String login) {
		this.login = login;
	}

	public Pessoa(String login, String nome, int idade) {
		this.login = login;
		this.nome = nome;
		this.idade = idade;
	}

	public String getLogin() {
		return login;
	}

	public String getRetornoNomeIdade() {
		return nome + " - " + idade + " anos";
	}

	public String getDescricao() {
		return nome + " - " + idade + " - " + dataNascimento;
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

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	@Override
	public String toString() {
		return "nome=" + nome + ", idade=" + idade;
	}

}
