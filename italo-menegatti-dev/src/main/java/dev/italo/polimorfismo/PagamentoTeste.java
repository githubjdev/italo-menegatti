package dev.italo.polimorfismo;

public class PagamentoTeste {
	
	
	public static void main(String[] args) {
		
		SistemaBancario bancario = new SistemaBancario();
		bancario.processarPagamento(new PagamentoPix(), 50.0);
		bancario.processarPagamento(new PagamentoCartao(), 60.0);
		
	}

}
