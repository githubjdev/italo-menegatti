package dev.italo.ddd;

import java.math.BigDecimal;

public class PagamentoMainTeste {
	public static void main(String[] args) throws Exception {
		
		PagamentoService pagamentoService = new PagamentoService();
		
		ContaCorrente origem = new ContaCorrente("845478", new BigDecimal(50.00));
		ContaCorrente destino = new ContaCorrente("762218", new BigDecimal(100.00));
		Dinheiro dinheiroPago = new Dinheiro(new BigDecimal(10.00));
		
		pagamentoService.pagar(origem, destino, dinheiroPago);
		
		System.out.println("CC Origem: " + origem.getSaldo());
		System.out.println("CC Destino: " + destino.getSaldo());

	}
}
