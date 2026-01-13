package dev.italo.abstracao;


/*Representa o esqueleto de uma arquitetura que representa o contexto de Animal*/
public abstract class Animal {
	
	protected String nome;
	
	/* Deverá ser implementado e sobreescrito pela classe concreta */
	public abstract void emitirSom();
	
	public Animal(String nome) {
		this.nome = nome;
	}
	
	public void dormir() {
		System.out.println(nome + " está dormindo");
	}

}
