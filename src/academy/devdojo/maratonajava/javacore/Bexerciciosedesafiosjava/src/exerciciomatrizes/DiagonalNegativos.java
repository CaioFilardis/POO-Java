package academy.devdojo.maratonajava.javacore.Bexerciciosedesafiosjava.src.exerciciomatrizes;

import java.util.Scanner;

/*
    Fazer um programa para ler um número inteiro N (máximo = 10) e uma matriz quadrada de ordem N
    contendo números inteiros. Em seguida, mostrar a diagonal principal e a quantidade de valores
    negativos da matriz.
*/
public class DiagonalNegativos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int contarNegativos = 0;

        System.out.print("Qual a ordem da matriz? ");
        int ordemMatriz = input.nextInt();

        int[][] matriz = new int[ordemMatriz][ordemMatriz];
        int [] diagonalPrincipal = new int[ordemMatriz];


        for (int i = 0; i < ordemMatriz; i++) {
            for (int j = 0; j < ordemMatriz; j++) {
                System.out.printf("Eleme'nto[%d, %d]: ", i,j);
                matriz[i][j] = input.nextInt();

                if (i == j) {
                    diagonalPrincipal[i] = matriz[i][j];
                }
            }
        }
        System.out.println("DIAGONAL PRINCIPAL");
        for (int diagonal: diagonalPrincipal) {
            System.out.printf("%d ",diagonal);
        }

        System.out.println();

        for (int[] arrayBase: matriz) {
            for (int array: arrayBase) {
                if (array < 0) {
                    contarNegativos++;
                }
            }
        }
        System.out.printf("QUANTIDADE DE NEGATIVOS = %d", contarNegativos);
    }
}
