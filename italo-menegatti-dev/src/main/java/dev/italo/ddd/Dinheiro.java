package dev.italo.ddd;

import java.math.BigDecimal;

public class Dinheiro {

	private BigDecimal valor;

	public Dinheiro(BigDecimal valor) throws Exception {

		if (valor == null || valor.doubleValue() <= 0) {
			throw new Exception("Valor inválido");
		}

		this.valor = valor;
	}

	public void somar(BigDecimal valor) {
		this.valor.add(valor);
	}

	public void subtrair(BigDecimal valor) {
		this.valor.subtract(valor);
	}
	
	public BigDecimal getValor() {
		return valor;
	}

}
