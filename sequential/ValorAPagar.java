package exercicios_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class ValorAPagar {

	public static void main(String[] args) {

		/**
		 * 
		 * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o
		 * valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e
		 * o valor unitário de cada peça 2.
		 * 
		 * Calcule e mostre o valor a ser pago.
		 * 
		 * 
		 * Write a program to read the code of part 1, the number of units of part 1,
		 * the unit price of each part 1, the code of part 2, the number of units of
		 * part 2 and the unit price of each part 2. Calculate and show the total amount
		 * to be paid.
		 */

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int codPecas1, numPecas1;
		int codPecas2, numPecas2;

		double preco1, preco2, valorPago;

		codPecas1 = sc.nextInt();
		numPecas1 = sc.nextInt();
		preco1 = sc.nextDouble();

		codPecas2 = sc.nextInt();
		numPecas2 = sc.nextInt();
		preco2 = sc.nextDouble();

		valorPago = (numPecas1 * preco1) + (numPecas2 * preco2);

		System.out.printf("VALOR A PAGAR: %.2f", valorPago);

		sc.close();

	}

}
