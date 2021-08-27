package calcularEmpresa;

import java.util.Scanner;

public class CalcularEmpresa {

	public static void main(String[] args) {

		double comissão;
		double salario;

		Scanner entrada = new Scanner(System.in);
		System.out.print("Insira o nome do(a) vendedor(a): ");
		String nome = entrada.next();
		System.out.print("A quantos anos o(a) " + nome + " trabalha na empresa? ");
		int tempo = entrada.nextInt();
		System.out.print("Qual o valor total de vendas do(a)" + nome + "? ");
		double valor = entrada.nextDouble();
		entrada.close();

		if (tempo >= 1 && valor >= 10000 && valor < 20000) {

			comissão = 0.05;

		} else if (tempo >= 1 && valor >= 20000) {

			comissão = 0.10;

		} else {

			comissão = 0.03;

		}

		salario = comissão * valor;
		System.out.println("A comissão de " + nome + "é: " + comissão);
		System.out.println("e o valor que deverá receber é: " + salario);

	}

}
