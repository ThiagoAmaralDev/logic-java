package exercicios_condicionais;

import java.util.Scanner;

public class HoraJogo {

	public static void main(String[] args) {

		/*
		 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do
		 * jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo
		 * 
		 * 
		 * uma duração mínima de 1 hora e máxima de 24 horas.
		 * 
		 * Based on the table below, write a program that reads an item code and the
		 * quantity of this item. Then, calculate and show the total amount to be paid.
		 */

		Scanner sc = new Scanner(System.in);

		int horaInicial, horaFinal;

		horaInicial = sc.nextInt();
		horaFinal = sc.nextInt();

		int duracao;

		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		} else {
			duracao = 24 - horaInicial + horaFinal;
		}

		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

		sc.close();
	}

}
