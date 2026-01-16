package dev.italo.composicao;

public class Carro {

	private Motor motor = new Motor();

	public void ligarCarro() {
		motor.ligar();
	}

	public void acelerarCarro() {
		motor.acelera();
	}

	public void pararCarro() {
		motor.desliga();
	}

}
