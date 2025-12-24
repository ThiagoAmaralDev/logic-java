package exercicios_funcoes;

public class Main {

	public static void main(String[] args) {
		/* C FOREACH
		 * 
		 * Crie um array de double com 4 notas: { 8.5, 7.0, 9.5, 5.0 }.
		 * 
		 * Use um laço (for ou for-each) para somar todas as notas.
		 * 
		 * Calcule a Média (Soma dividida pelo tamanho do array).
		 * 
		 * Use um if/else para imprimir a situação final:
		 * 
		 * Se média >= 7: "Aprovado"
		 * 
		 * Se média entre 5 e 6.9: "Recuperação"
		 * 
		 * Se média < 5: "Reprovado"
		 * 
		 * 
     * Create a double array with 4 grades: { 8.5, 7.0, 9.5, 5.0 }.
		 * Use a loop (for or for-each) to sum all the grades.
		 * Calculate the Average (Sum divided by the array length).
		 * Use if/else to print the final status:
		 * If average >= 7: "Approved", if between 5 and 6.9: "Retake", if < 5: "Failed".
		 * Bonus: Also print what was the lowest grade the student received.
		 */

		
		double[] notas = { 8.5, 7.0, 9.5, 5.0 };

		double total = 0;
		
		double menorNota = notas[0];

		// LEITURA: "Para cada 'nota' do tipo double dentro de 'notas'..."
		for (double nota : notas) {

			total = total + nota;

			
			if (nota < menorNota) {
				menorNota = nota; // Atualizo!
			}
		}

		double media = total / notas.length;

		System.out.printf("Média Final: %.2f \n", media);
		System.out.println("Menor Nota: " + menorNota);

		if (media >= 7) {
			System.out.println("Situação: Aprovado");
		} else if (media >= 5) {
			System.out.println("Situação: Recuperação");
		} else {
			System.out.println("Situação: Reprovado");
		}
	}

}
