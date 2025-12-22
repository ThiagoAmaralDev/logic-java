package exercicios_condicionais;

import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		/*
		 * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem
		 * 
		 * 
		 * "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são
		 * múltiplos entre si.
		 * 
		 * 
		 * Atenção: os números devem poder ser digitados em ordem crescente ou
		 * decrescente.
		 * 
		 * Read 2 integer values (A and B). Then, the program should display a message
		 * "Sao Multiplos" or "Nao sao Multiplos", indicating if the values are
		 * multiples of each other. Note: the numbers can be entered in ascending or
		 * descending order.
		 */

		Scanner sc = new Scanner(System.in);

		int a, b;

		a = sc.nextInt();
		b = sc.nextInt();

		if (a % b == 0 || b % a == 0) {
			System.out.println("São múltiplos");
		} else {
			System.out.println("Não são múltiplos");

		}

		sc.close();

	}

}
