package calcularEmpresa;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalcularEmpresa {

	public static void main(String[] args) {

		double comiss�o, salario, valor;
		int tempo;

		DecimalFormat duas = new DecimalFormat("0.00");

		Scanner entrada = new Scanner(System.in);
		System.out.print("Insira o nome do(a) vendedor(a): ");
		String nome = entrada.next();
		System.out.print("A quantos anos o(a) " + nome + " trabalha na empresa? ");
		tempo = entrada.nextInt();
		System.out.print("Qual o valor total de vendas do(a)" + nome + "? ");
		valor = entrada.nextDouble();
		entrada.close();

		if (tempo >= 1 && valor >= 10000 && valor < 20000) {

			comiss�o = 0.05;

		} else if (tempo >= 1 && valor >= 20000) {

			comiss�o = 0.1;

		} else {

			comiss�o = 0.03;

		}

		salario = comiss�o * valor;
		System.out.println("A comiss�o de " + nome + " �: " + comiss�o);
		System.out.println("e o valor que dever� receber �: " + duas.format(salario));
	}

}
