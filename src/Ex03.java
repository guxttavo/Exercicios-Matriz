/*
-->Gere e imprima uma matriz M 10x10 com valores aleatórios entre 0-9.
-->Após isso indique qual é a maior e menor valor da linha 5 e qual é o maior e o
   menor valor da coluna 7.
*/

import java.util.Random;

public class Ex03 {
    public static void main(String[] args) {

        Random random = new Random();

        int[][] matriz = new int[10][10];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(10);
            }
        }

        System.out.println("Matriz digitada: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        int maiorL5 = 0;
        int menorL5 = 101;
        int linha5 = 0;
        for (int i = 0; i < matriz[linha5].length; i++) {
            if (matriz[linha5][i] > maiorL5) {
                maiorL5 = matriz[linha5][i];
            }
            if (matriz[linha5][i] < menorL5) {
                menorL5 = matriz[linha5][i];
            }
        }

        System.out.println("Maior valor linha 5: " + maiorL5);
        System.out.println("Menor valor linha 5: " + menorL5);

        int maiorC7 = 0;
        int menorC7 = 101;
        int col7 = 0;
        for (int i = 0; i < matriz[linha5].length; i++) {
            if (matriz[i][col7] > maiorC7) {
                maiorC7 = matriz[linha5][i];
            }
            if (matriz[i][col7] < menorC7) {
                menorC7 = matriz[linha5][i];
            }
        }

        System.out.println("Maior valor coluna 7: " + maiorC7);
        System.out.println("Menor valor coluna 7: " + menorC7);
    }
}
