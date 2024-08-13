package academy.devdojo.maratonajava.javacore.Bexerciciosedesafiosjava.src.exerciciomatrizes;

import java.util.Scanner;
/*
    Fazer um programa para ler duas matrizes de números inteiros A e B, contendo de M linhas e N colunas
    cada (M e N máximo = 10). Depois, gerar uma terceira matriz C onde cada elemento desta é a soma
    dos elementos correspondentes das matrizes originais. Imprimir na tela a matriz gerada.
*/
public class SomaMatrizes {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Quantas linhas vao ter cada matriz? ");
        int quantidadeLinhas = input.nextInt();

        System.out.println("Quantas colunas vao ter cada matriz ");
        int quantidadeColunas = input.nextInt();

        int[][] matrizA = new int[quantidadeLinhas][quantidadeColunas];
        int[][] matrizB = new int[quantidadeLinhas][quantidadeColunas];
        int[][] somaMatriz = new int[quantidadeLinhas][quantidadeColunas];

        System.out.println("Diigte os valores da matriz A: ");
        for (int i = 0; i < quantidadeLinhas; i++) {
            for (int j = 0; j < quantidadeColunas; j++) {
                System.out.printf("Elemento [%d, %d]: ", i,j);
                matrizA[i][j] = input.nextInt();
            }
        }

        System.out.println("Diigte os valores da matriz B: ");
        for (int i = 0; i < quantidadeLinhas; i++) {
            for (int j = 0; j < quantidadeColunas; j++) {
                System.out.printf("Elemento [%d, %d]: ", i,j);
                matrizB[i][j] = input.nextInt();
            }
        }

        System.out.println("MATRIZ SOMA:");
        for (int i = 0; i < quantidadeLinhas; i++) {
            for (int j = 0; j < quantidadeColunas; j++) {
                somaMatriz[i][j] = matrizA[i][j] + matrizB[i][j];
                System.out.printf("%d ", somaMatriz[i][j]);
            }
            System.out.println();
        }
    }
}
