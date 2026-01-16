package dev.italo.composicao;

public class ContaMain {

	public static void main(String[] args) {
		ContaCorrente contaCorrente = new ContaCorrente();

		contaCorrente.setAgencia(1);
		contaCorrente.setCodigo(54545);
		contaCorrente.setDigito(0);
		contaCorrente.setTipo("CORRENTE");

		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Alex fernando Egidi");
		pessoa.setCpf("44454.545454.54");

		contaCorrente.setPessoa(pessoa);
		
		
		System.out.println(contaCorrente.getPessoa().getNome());
		System.out.println(contaCorrente.getPessoa().getCpf());
		System.out.println(contaCorrente.getAgencia());
		
		

	}

}
