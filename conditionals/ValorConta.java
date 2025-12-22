package exercicios_condicionais;

import java.util.Locale;
import java.util.Scanner;

public class ValorConta {

	public static void main(String[] args) {

		/*
		 * Com base na tabela abaixo, 
		 * escreva um programa que leia o código de um item e
		 * a quantidade deste item.
		 * 
		 * A seguir, calcule e mostre o valor da conta a pagar.
		 * 
		 * Based on the table below, write a program that reads an item code and the quantity of this item.
		 * Then, calculate and show the total amount to be paid.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int idItem, quantidadeItem;

		idItem = sc.nextInt();
		quantidadeItem = sc.nextInt();
		
		double resultado = 0;
		
		if(idItem == 1) {
			resultado = 4.00 * quantidadeItem;
		}
		else if(idItem == 2) {
			resultado = 4.50 * quantidadeItem;
		}
		else if(idItem == 3) {
			resultado = 5.00 * quantidadeItem;
		}
		else if(idItem == 4) {
			resultado = 2.00 * quantidadeItem;
		}
		else if(idItem == 5) {
			resultado = 1.50 * quantidadeItem;
		}
		else {
			System.out.println("Inválido.");
		}
		
		System.out.printf("Total: R$ %.2f", resultado);
		sc.close();
	}

}
