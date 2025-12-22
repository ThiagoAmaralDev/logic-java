package exercicios_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class NumeroESalario {

	public static void main(String[] args) {

		/*
		 * Fazer um programa que leia o número de um funcionário, seu número de horas
		 * trabalhadas, o valor que recebe por hora
		 * 
		 * e calcula o salário desse funcionário.
		 * 
		 * 
		 * A seguir, mostre o número e o salário do funcionário, com duas casas decimais
		 * 
		 * * Exercise: Leia o número de um funcionário, as horas trabalhadas e o valor
		 * da hora, e calcule o salário.
		 * 
		 * 
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int id, horasTrabalhadas;
		double valorRecebido, salario;

		id = sc.nextInt();
		horasTrabalhadas = sc.nextInt();
		valorRecebido = sc.nextDouble();

		salario = valorRecebido * horasTrabalhadas;

		System.out.println("NUMBER: " + id);
		System.out.printf("SALARY = U$ %.2f", salario);

		sc.close();

	}

}
