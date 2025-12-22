package exercicios_condicionais;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um número inteiro e dizer se este número é par ou
		 * ímpar.
		 * 
		 * Write a program to read an integer and determine if it is even or odd.
		 */

		Scanner sc = new Scanner(System.in);

		int numero;

		numero = sc.nextInt();

		if (numero % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}

		sc.close();
	}

}
