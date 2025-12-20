package dev.italo.collection;

import java.util.ArrayList;
import java.util.List;

public class Main1 {

	public static void main(String[] args) {

		List<Pedido> list = new ArrayList<Pedido>();
		list.add(new Pedido("1", "OK"));
		list.add(new Pedido("2", "CANCELADO"));
		list.add(new Pedido("3", "OK"));
		list.add(new Pedido("4", "CANCELADO"));

		list.removeIf(p -> p.getStatus().equals("OK"));

		list.forEach(System.out::println);

	}

}
