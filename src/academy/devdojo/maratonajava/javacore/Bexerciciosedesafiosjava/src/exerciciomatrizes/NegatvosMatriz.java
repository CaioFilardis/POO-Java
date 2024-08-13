package academy.devdojo.maratonajava.javacore.Bexerciciosedesafiosjava.src.exerciciomatrizes;

import java.util.Scanner;

/*
    Ler dois números M e N (máximo = 10), e depois ler uma matriz MxN de números inteiros, conforme
    exemplo. Em seguida, mostrar na tela somente os números negativos da matriz.
*/

public class NegatvosMatriz {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Qual a quantidade de linhas da matriz? ");
        int quantidadeLinhas = input.nextInt();

        System.out.printf("Qual a quantidade de colunas da matriz? ");
        int quantidadeColunas = input.nextInt();

        int[][] matriz = new int[quantidadeLinhas][quantidadeColunas];
        int[] numerosNegativos = new int[quantidadeColunas];

        for (int i = 0; i < quantidadeLinhas; i++) {
            for (int j = 0; j < quantidadeColunas; j++) {
                System.out.printf("Elemento [%d,%d]: ", i,j);
                matriz[i][j] = input.nextInt();
            }
        }

        System.out.println("VALORES NEGATIVOS");
        for (int[] negativos: matriz) {
           for (int numNegativo: negativos) {
               if (numNegativo < 0) {
                   System.out.println(numNegativo);
               }
           }
        }
    }
}
