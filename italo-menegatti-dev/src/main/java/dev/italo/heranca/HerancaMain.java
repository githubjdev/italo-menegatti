package dev.italo.heranca;

public class HerancaMain {

	public static void main(String[] args) {

		Carro carro = new Carro();
		carro.setMontadora("Fiat");
		carro.setValor(20.000);
		carro.setHpCavalo(60);
		carro.setNome("Marea");
		carro.setTetoSolar(true);
		
		System.out.println(carro);
		carro.mover();

	}

}
