package dev.italo.ddd;

import java.math.BigDecimal;

public class ContaCorrente {

	private String numero;
	private BigDecimal saldo;

	public ContaCorrente(String numero, BigDecimal saldo) throws Exception {
		super();
		
		if (saldo.doubleValue() <= 0) {
			throw new Exception("Saldo Inváido");
		}
		this.numero = numero;
		this.saldo = saldo;
	}

	public void depositar(BigDecimal valor) throws Exception {

		if (valor.doubleValue() <= 0) {
			throw new Exception("Valor do depósito é inválido");
		}

		saldo = saldo.add(valor);

	}

	public void debitar(BigDecimal valor) throws Exception {

		if (valor.doubleValue() <= 0) {
			throw new Exception("Valor do débito é inválido");
		}

		if (saldo.doubleValue() <= 0) {
			throw new Exception("Saldo insuficiente");
		}

		saldo = saldo.subtract(valor);

	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public String getNumero() {
		return numero;
	}

}
