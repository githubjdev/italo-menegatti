package dev.italo.solid.dip;

public class MySQL implements Banco {

	@Override
	public void conectar() {
		System.out.println("Conectando com o banco Mysql");

	}

}
