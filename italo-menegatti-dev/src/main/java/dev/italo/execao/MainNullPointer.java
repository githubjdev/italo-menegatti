package dev.italo.execao;

public class MainNullPointer {

	public static void main(String[] args) {

		/*
		 * Pedido pedido = new Pedido(); pedido.setStatus("Cacnelado");
		 * 
		 * System.out.println(pedido.getStatus());
		 */

		int[] array = new int[] { 10, 21 };

		System.out.println(array[2]);

	}

}
