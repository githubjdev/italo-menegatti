package dev.italo.abstracao;

public class Gato extends Animal {

	public Gato(String nome) {
		super(nome);
	}

	@Override
	public void emitirSom() {
		System.out.println("miau miau");
	}
	
	@Override
	public void dormir() {
		
		System.out.println(nome + " está dormindo na cama");
	}

}
