package dev.italo.collection;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		String[] endPoint = { "/login", "/home", "/login", "/home", "/produtos" };

		Map<String, Integer> contador = new HashMap<String, Integer>();
		
		for (String ep : endPoint) {
			int atual = contador.getOrDefault(ep, 0);
			contador.put(ep, atual + 1);
		}
		
		for (String chave : endPoint) {
			System.out.println("chave: " + chave + ", valor: " + contador.get(chave));
		}
		
		var nomes = List.of("Alex", "Maria", "João");

		for (var string : nomes) {
			System.out.println(string);
		}
		
		
		

	}

}
