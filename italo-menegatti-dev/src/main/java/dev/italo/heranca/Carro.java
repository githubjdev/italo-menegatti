package dev.italo.heranca;

public class Carro extends Veiculo {

	private int hpCavalo;

	private boolean tetoSolar;

	public void setTetoSolar(boolean tetoSolar) {
		this.tetoSolar = tetoSolar;
	}

	public boolean isTetoSolar() {
		return tetoSolar;
	}

	public int getHpCavalo() {
		return hpCavalo;
	}

	public void setHpCavalo(int hpCavalo) {
		this.hpCavalo = hpCavalo;
	}

	@Override
	public String toString() {
		return "Carro [nome=" + getNome() + ", Montadora=" + getMontadora() + "]";
	}
	
	
	

}
