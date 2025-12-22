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
		 * Read the start time and end time of a game. Then calculate the duration of
		 * the game, knowing that it can start on one day and end on another, with a
		 * minimum duration of 1 hour and a maximum of 24 hours.
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
