package dev.italo.model;

import java.time.LocalDate;

public class MainPessoa {
	
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa("logina1233");
		pessoa.setNome("Alex");
		pessoa.setIdade(38);
		pessoa.setDataNascimento(LocalDate.now());
		System.out.println("Login : " + pessoa.getLogin());
		
	}

}
