package exercicios_sequencial;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		/*
         * Exercise: Read two integer values and print their sum
         * with an explanatory message.
         * 
         * Exercício: Faça um programa para ler dois valores inteiros
         * e depois mostrar na tela a soma desses números com uma
         * mensagem explicativa.
         */
		
		int a, b, soma;
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		soma = a + b;
		
		System.out.println("SOMA: "+ soma);
		
		
	}

}
