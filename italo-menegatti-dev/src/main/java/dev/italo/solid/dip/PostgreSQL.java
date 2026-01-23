package dev.italo.solid.dip;

public class PostgreSQL implements Banco {

	@Override
	public void conectar() {
		System.out.println("Conectando ao PostgreSQL");
	}

}
