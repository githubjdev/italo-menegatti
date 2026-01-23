package dev.italo.polimorfismo;

public class SistemaBancario {

	public void processarPagamento(Pagamento pagamento, double valor) {
		pagamento.pagar(valor);
	}

}
