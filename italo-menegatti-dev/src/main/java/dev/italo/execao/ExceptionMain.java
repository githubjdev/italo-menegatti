package dev.italo.execao;

public class ExceptionMain {

	public static void main(String[] args) {

		Integer numero = 0;

		try {
			numero = Integer.parseInt("SSkkk");

		} catch (java.lang.NumberFormatException e) {
			System.out.println("Valor de venda inválido, corrija.");
			return;
		}

		/* Tudo daqui pra baixo não executa */

		System.out.println("Valor da venda :" + numero);

	}

}
