package dev.italo.ddd;

public class PagamentoService {

	public void pagar(ContaCorrente origem, ContaCorrente destino, Dinheiro dinheiro) throws Exception {
		origem.debitar(dinheiro.getValor());
		destino.depositar(dinheiro.getValor());

	}

}
