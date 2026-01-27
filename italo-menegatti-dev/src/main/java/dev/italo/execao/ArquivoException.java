package dev.italo.execao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ArquivoException {

	public static void main(String[] args) throws Exception {

		BufferedReader br = null;
		try {

			br = new BufferedReader(new FileReader("tabela_produtos.xls"));

		} catch (FileNotFoundException e) {
			throw new FileNotFoundException("Tabela de produtos não encontrada para importação");

		} finally {/* Sempre executa */
			br.close();
		}

	}

}
