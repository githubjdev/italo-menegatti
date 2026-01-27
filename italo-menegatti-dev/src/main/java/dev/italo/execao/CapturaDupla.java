package dev.italo.execao;

public class CapturaDupla {

	public static void main(String[] args) throws Exception {

		try {

			int salario = Integer.parseInt("0".trim());

			if (salario <= 0) {
				throw new Exception("Salário é invalido");
			}

			System.out.println(salario / 30);

		} catch (NumberFormatException e) {
			throw new NumberFormatException("Campo de salário é inválido");
		} catch (ArithmeticException e) {
			throw new ArithmeticException("Não pode ser feita divisão do salário por zero");
		}

	}

}
