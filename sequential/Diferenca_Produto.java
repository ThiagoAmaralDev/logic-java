package exercicios_sequencial;

import java.util.Scanner;

public class Diferenca_Produto {

	public static void main(String[] args) {

		/*
		 * Exercise: Read four integer values and calculate the difference
		 * between the product of the first two and the product of the last two.
		 *
		 * Exercise: Leia quatro valores inteiros e calcule a diferença
		 * entre o produto dos dois primeiros e o produto dos dois últimos.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, diferencaProduto;
		
		
		
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		diferencaProduto = (a * b - c * d);
		
		System.out.println("DIFERENÇA = " +diferencaProduto);
		
		sc.close();		

	}

}
