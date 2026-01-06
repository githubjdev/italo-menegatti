package dev.italo.generics;

import dev.italo.model.Pessoa;
import dev.italo.model.Produto;

public class ResponseUso {

	public static void main(String[] args) {

		ResponseApi<String> r1 = new ResponseApi<String>("ok", "operação feita", 200);
		ResponseApi<Integer> r2 = new ResponseApi<Integer>(10, "operação feita", 403);
		ResponseApi<Pessoa> r3 = new ResponseApi<Pessoa>(new Pessoa("admin", "alex", 38), "salvo com sucesso", 200);

		ResponseApi<Produto> r4 = new ResponseApi<Produto>(new Produto("Mouse", 120.0), "salvo som sucesso", 204);

		System.out.println("Nome: " + r3.getData().getNome());
		System.out.println("Message :" + r3.getMessage());
		System.out.println("code :" + r3.getCode());
		


	}

}
