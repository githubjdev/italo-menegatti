package dev.italo.generics;

import dev.italo.model.Pessoa;
import dev.italo.model.Produto;

public class RepositoryUso {
	
	public static void main(String[] args) {
		
		InMemoryRepository<Produto, Long> repository = new InMemoryRepository<Produto, Long>();
		InMemoryRepository<Pessoa, Long> repository2 = new InMemoryRepository<Pessoa, Long>();
		
		repository.save(1L, new Produto("Teclado", 150));
		repository.save(2L, new Produto("Monitor", 890));
		
		System.out.println("Obejto salvo: " + repository.findById(2L));
		
		System.out.println("=================================================");
		
		for (Produto p : repository.findAll()) {
			System.out.println(p);
		}
		
		
		repository.delete(1L);
		
		
		System.out.println("======================Depois que deletou===========================");
		
		for (Produto p : repository.findAll()) {
			System.out.println(p);
		}
		
		
		
	}

}
