package exerciciosarrays;

import java.util.Scanner;

/*Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa 
  que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número 
  de homens. */

public class DadosPessoas {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		int quantidadeHomens = 0, quantidadeMulheres = 0;
		float menorAltura = 9999, maiorAltura = 0, somandoAlturaMulheres = 0;
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int quantidadePessoas = input.nextInt();
		
		float[] altura = new float[quantidadePessoas];
		char[] sexo = new char[quantidadePessoas];
		
		for (int i = 0; i < quantidadePessoas; i++) {
			System.out.printf("Altura da %d° pessoa: ", i+1);
			altura[i] = input.nextFloat();
			System.out.printf("Genero da %d° pessoa: ", i+1);
			sexo[i] = input.next().charAt(0);
			
			if (sexo[i] == 'F') {
				quantidadeMulheres++;
				somandoAlturaMulheres += altura[i];
				
			} else {
				quantidadeHomens++;
			}
			
			if (menorAltura > altura[i]) {
				menorAltura = altura[i];
			}
			
			if (maiorAltura < altura[i]) {
				maiorAltura = altura[i];
			}
		}
		
		System.out.printf("Menor altura = %.2f%n", menorAltura);
		System.out.printf("Maior altura = %.2f%n", maiorAltura);
		
		float mediaAlturaMulheres = somandoAlturaMulheres / quantidadeMulheres;
		System.out.printf("Media das alturas das mulheres = %.2f%n", mediaAlturaMulheres);
		
		System.out.print("Numero de homens = "+quantidadeHomens);
		
		
	}
}
