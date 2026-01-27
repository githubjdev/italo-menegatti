package dev.italo.execao;

public class ContaBancaria {

	private double saldo;

	public ContaBancaria(double saldo) {
		this.saldo = saldo;
	}

	public void sacar(double valor) throws SaldoInsuficienteException {
		if (valor > saldo) {
			throw new SaldoInsuficienteException("Saldo na conta bancária é insuficente");
		}

		saldo -= valor;
	}
	
	
	public double getSaldo() {
		return saldo;
	}

}
