/*
-->Ler um número inteiro N representando a ordem de uma matriz quadrada.
-->Ler uma matriz de números reais, depois mostrar a soma da diagonal principal da matriz.

*/

import java.util.Locale;
import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a ordem da matriz? ");
        int ordem = sc.nextInt();

        double[][] matriz = new double[ordem][ordem];


        System.out.println("Digite os valores da matriz: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = sc.nextDouble();
            }
        }

        double soma = 0.0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i == j) {
                    soma = soma + matriz[i][j];

                }
            }
        }

        System.out.println("Matriz digitada: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
