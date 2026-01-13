package dev.italo.abstracao;

public class TesteAbstrac {

	public static void main(String[] args) {

		Animal cachorro = new Cachorro("Zeus");

		Animal gato = new Gato("mi mi ");

		Zoologico zoologico = new Zoologico();
		zoologico.interagirComAnimal(gato);
		System.out.println("=========================================");
		zoologico.interagirComAnimal(cachorro);

	}

}
