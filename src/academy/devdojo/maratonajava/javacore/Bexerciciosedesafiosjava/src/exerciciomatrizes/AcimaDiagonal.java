package academy.devdojo.maratonajava.javacore.Bexerciciosedesafiosjava.src.exerciciomatrizes;

import java.util.Scanner;

/*
    Ler um inteiro N (máximo = 10) e uma matriz quadrada de ordem N
    contendo números inteiros. Mostrar a soma dos elementos acima da
    diagonal principal. Um exemplo de números acima da diagonal
    principal é mostrado ao lado (no caso as células com fundo cinza).
*/

public class AcimaDiagonal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int somaElemento = 0;

        System.out.print("Qual a ordem da matriz? ");
        int ordemMatriz = input.nextInt();
        int[][] matriz = new int[ordemMatriz][ordemMatriz];

        for (int i = 0; i < ordemMatriz; i++) {
            for (int j = 0; j < ordemMatriz; j++) {
                System.out.printf("Elemento [%d, %d]: ", i,j);
                matriz[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < ordemMatriz; i++) {
            for (int j = 0; j < ordemMatriz; j++) {
                if (i < j ) {
                    somaElemento += matriz[i][j];
                }
            }
        }
        System.out.println("SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL = "+somaElemento);
    }
}
