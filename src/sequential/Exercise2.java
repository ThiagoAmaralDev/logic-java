package exercicios_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class RaioEArea {

    public static void main(String[] args) {

        /*
         * Exercise: Read the radius of a circle and calculate its area.
         * Print the result with four decimal places.
         *
         * Formula: area = π * radius²
         * Consider π = 3.14159
         * 
         * Exercício: Faça um programa para ler o valor do raio de um círculo
         * e depois mostrar o valor da área deste círculo com quatro casas decimais.
         * 
         * Fórmula da área: area = π * raio²
         * Considere o valor de π = 3.14159
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double raio;
        double pi = 3.14159;

        raio = sc.nextDouble();

        double area = pi * Math.pow(raio, 2);

        System.out.printf("A: %.4f", area);
    }
}
