/*
-->Capture do teclado os valores para preenchimento de uma matriz M 3x3.
-->Após a captura imprima a matriz criada e encontre a quantidade de
   números pares e ímpares.
*/

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a ordem da matriz? ");
        int ordemMatriz = sc.nextInt();

        int[][] matriz = new int[ordemMatriz][ordemMatriz];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Digite os valores da posição: " + "[" + i + "," + j + "]");
                matriz[i][j] = sc.nextInt();
            }
        }

        int qtnPar = 0;
        int qtnImpar = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    qtnPar++;
                } else {
                    qtnImpar++;
                }
            }
            System.out.println();
        }

        System.out.println("Matriz digitada: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Quantidade números pares: " + qtnPar);
        System.out.println("Quantidade números ímpares: " + qtnImpar);


    }
}
