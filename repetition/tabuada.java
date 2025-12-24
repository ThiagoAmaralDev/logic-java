package exercicios_repeticao;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {

		/*
		 * 
		 * Crie um código que escolha um número (ex: int numero = 7;) e imprima a
		 * tabuada completa dele, de 1 a 10.
		 * 
		 * Write a program to read an integer and print its complete multiplication
		 * table, from 1 to 10.
		 * 
		 */
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número para ver a tabuada: ");
		int numeroTabuada = sc.nextInt();

		for (int i = 0; i <= 10; i++) {
			int produtoMultiplicacao = numeroTabuada * i;
			System.out.println(numeroTabuada + " x " + i + " = " + produtoMultiplicacao);
		}

		sc.close();

	}

}
