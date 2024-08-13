package exerciciosarrays;

import java.util.Scanner;

/*
 Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. 
 Em seguida,mostrar na tela a média aritmética de todos elementos com três casas decimais. 
 Depois mostrar todos os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.*/

public class AbaixoDaMedia {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double soma = 0.0;
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int quantidadeDeElementos = input.nextInt();
		
		double[] numeros = new double[quantidadeDeElementos];
		
		for (int i = 0; i < quantidadeDeElementos; i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = input.nextFloat();
			
			soma += numeros[i];
		}
		
		double media = soma / quantidadeDeElementos;
		System.out.printf("\nMEDIA DO VETOR = %.3f", media);
		
		System.out.println("\nELEMENTOS ABAIXO DA MEDIA:");
		for (double abaixoDaMedia:numeros) {
			
			if (abaixoDaMedia < media) {
				System.out.printf("%.1f%n", abaixoDaMedia);
			}
		}
	}
}
