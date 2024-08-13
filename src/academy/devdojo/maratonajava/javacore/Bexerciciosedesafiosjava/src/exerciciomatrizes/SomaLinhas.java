package academy.devdojo.maratonajava.javacore.Bexerciciosedesafiosjava.src.exerciciomatrizes;

import java.util.Scanner;
/*
    Fazer um programa para ler dois números inteiros M e N (máximo = 10). Em seguida, ler uma matriz
    de M linhas e N colunas contendo números reais. Gerar um vetor de modo que cada elemento do vetor
    seja a soma dos elementos da linha correspondente da matriz. Mostrar o vetor gerado.
*/
public class SomaLinhas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int somaPrimeiraLinhas = 0, somaSegundaLinha = 0;

        System.out.print("Qual a quantidade de linhas da matriz? ");
        int quantidadeLinhas = input.nextInt();

        System.out.print("Qual a quantidade de colunas da matriz? ");
        int quantidadeColunas = input.nextInt();

        int[][] matriz = new int[quantidadeLinhas][quantidadeColunas];

        for (int i = 0; i < quantidadeLinhas; i++) {
            System.out.printf("Diigte os elementos da %da. linha: %n", i+1);
            for (int j = 0; j < quantidadeColunas; j++) {
                matriz[i][j] = input.nextInt();

                if (i == 0) {
                    somaPrimeiraLinhas += matriz[i][j];
                } else {
                    somaSegundaLinha += matriz[i][j];
                }
            }
        }

        System.out.println("VETOR GERADO: ");
        System.out.println(somaPrimeiraLinhas);
        System.out.println(somaSegundaLinha);

    }
}
