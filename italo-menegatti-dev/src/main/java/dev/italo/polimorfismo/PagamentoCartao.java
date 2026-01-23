package dev.italo.polimorfismo;

public class PagamentoCartao implements Pagamento {

	@Override
	public void pagar(double valor) {
		System.out.println("Pagamento por cartão de crédito: " + valor);

	}

}
