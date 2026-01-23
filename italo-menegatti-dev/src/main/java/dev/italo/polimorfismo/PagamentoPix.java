package dev.italo.polimorfismo;

public class PagamentoPix implements Pagamento {
	
	

	@Override
	public void pagar(double valor) {

		System.out.println("Pagamento por PIX realixado: " + valor);
		
		

	}

}
