package dev.italo.solid.dip;

public class TestaBanco {
	
	public static void main(String[] args) {
		SistemaFinceiro finceiro = new SistemaFinceiro(new PostgreSQL());
		SistemaFinceiro finceiro2 = new SistemaFinceiro(new MySQL());
	}

}
