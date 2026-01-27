package dev.italo.execao;

public class ContaCorrenteMain {
	
	
	public static void main(String[] args) throws SaldoInsuficienteException {
		Thread.setDefaultUncaughtExceptionHandler(new GlobalExceptionHandler());
		
		
		
		ContaBancaria conta = new ContaBancaria(500.00);
		conta.sacar(600);
		
		
		System.out.println("Saldo atual: " + conta.getSaldo());
		
	}

}
