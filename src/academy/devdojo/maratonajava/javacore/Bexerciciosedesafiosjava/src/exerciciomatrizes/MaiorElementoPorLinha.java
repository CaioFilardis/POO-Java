package academy.devdojo.maratonajava.javacore.Bexerciciosedesafiosjava.src.exerciciomatrizes;

import java.util.Scanner;

/*
    Ler um inteiro N e uma matriz quadrada de ordem N (máximo = 10). Mostrar qual o maior elemento
    de cada linha. Suponha não haver empates.
*/

public class MaiorElementoPorLinha {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maiorValor;

        System.out.println("Qual a orde da matriz? ");
        int ordemMatriz = input.nextInt();

        int[][] matriz = new int[ordemMatriz][ordemMatriz];
        int[] maiorElemento = new int[ordemMatriz];

        for (int i = 0; i < ordemMatriz; i++) {
            for (int j = 0; j < ordemMatriz; j++) {
                System.out.printf("Elemento [%d, %d]: ", i, j);
                matriz[i][j] = input.nextInt();
            }
        }

        System.out.println("MAIOR ELEMENTO DE CADA LINHA:");
        for (int[] arrayBase: matriz) {
            maiorValor = 0;
            for (int maior:arrayBase) {
                if (maiorValor < maior) {
                    maiorValor = maior;
                }
            }
            System.out.println(maiorValor);
        }
    }
}
