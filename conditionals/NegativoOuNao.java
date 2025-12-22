package exercicios_condicionais;

import java.util.Scanner;

public class NegativoOuNao {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um número inteiro , e depois dizer se este número
		 * é negativo ou não.
		 * 
		 * Write a program to read an integer and then determine if this number is
		 * negative or not.
		 */

		Scanner sc = new Scanner(System.in);

		int numero;

		numero = sc.nextInt();

		if (numero < 0) {
			System.out.println("NEGATIVO");
		} else {
			System.out.println("NÃO NEGATIVO");

		}

		sc.close();

	}

}
