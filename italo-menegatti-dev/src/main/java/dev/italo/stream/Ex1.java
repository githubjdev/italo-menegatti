package dev.italo.stream;

import java.util.List;

import dev.italo.model.Produto;

public class Ex1 {
	
	public static void main(String[] args) {
		List<Produto> produtos = List.of(new Produto("Teclado", 150.00, false),
				                         new Produto("Mouse", 50.00, true), 
				                         new Produto("Monitor", 950.00, true));
		
		
		System.out.println("------------Produto Filtrado-------------");
		List<Produto> filtro = produtos.stream().filter(Produto::getAtivo).toList();
		
		
		filtro.forEach(u -> System.out.println(u.getNome()));
		
		
		System.out.println("-----------------Apenas nomes----------------------");
		
		
		List<String> nomes = produtos.stream().map(Produto::getNome).toList();
		
		nomes.forEach(System.out::println);
		
		
		System.out.println("-----------------Soma total----------------------");
		
		double total = produtos.stream().mapToDouble(Produto::getValor).sum();
		
		System.out.println("Soma total: " + total);
		
	}

}
