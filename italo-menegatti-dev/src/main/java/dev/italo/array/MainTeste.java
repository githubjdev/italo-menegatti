package dev.italo.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainTeste {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno("alex", 38);
		Aluno aluno2 = new Aluno("Italo", 29);
		Aluno aluno3 = new Aluno("José", 50);

		List<Aluno> alunos = new ArrayList<Aluno>();
		alunos.add(aluno1);
		alunos.add(aluno2);
		alunos.add(aluno3);

		for (Aluno aluno : alunos) {
			System.out.println(aluno.dados());
		}

		List<String> listString = new ArrayList<String>();
		listString.add("Alex");
		listString.add("Italo");

		List lisGenerica = new ArrayList<>();
		lisGenerica.add("Alex");
		lisGenerica.add(aluno3);

		for (Object object : lisGenerica) {

			if (object instanceof Aluno) {
				Aluno aluno = (Aluno) object; /* Conversão de Cast */
				System.out.println(aluno.dados());
			} else {
				System.out.println(object);
			}
		}

		for (int i = 0; i < alunos.size(); i++) {
			System.out.println(alunos.get(i).dados());
		}

		Map<String, List<Aluno>> map = new HashMap<String, List<Aluno>>();
		map.put("1", alunos);
		map.put("2", alunos);
		map.put("3", alunos);

		for (String key : map.keySet()) {

			for (Aluno aluno : map.get(key)) {
				System.out.println(aluno.dados());
			}
		}

	}

}
