package exercicios_sequencial;

import java.util.Scanner;

public class DiferencasMultiplas {

	public static void main(String[] args) {

		/*
		 * Exercise: Read multiple integer values and calculate
		 * differences according to the defined rules.
		 *
		 * Exercise: Leia vários valores inteiros e calcule
		 * as diferenças de acordo com as regras definidas.
		 */
		
		Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int result = (a * b) - (c * d);

        System.out.println("RESULT = " + result);

        sc.close();

	}

}
