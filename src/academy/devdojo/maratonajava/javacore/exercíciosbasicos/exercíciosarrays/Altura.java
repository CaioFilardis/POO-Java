package exerciciosarrays;

import java.util.Scanner;


/*
	Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. 
	Depois, mostrar na tela a altura média das pessoas, e mostrar também a porcentagem 
	de pessoas com menos de 16 anos, bem como os nomes dessas pessoas caso houver.
*/
public class Altura {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int quantidadeMenores = 0;
		float  soma = 0;
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int quantidadeDigitada = input.nextInt();
		
		
		String[] nomes = new String[quantidadeDigitada];
		int[] idades = new int[quantidadeDigitada];
		double[] alturas = new double[quantidadeDigitada];
		
		
		for (int i = 0; i < quantidadeDigitada; i++) {
			
			System.out.printf("Dados da %d pessoa %n", i + 1);
			
			System.out.print("Nome: ");
			nomes[i] = input.next();
			
			System.out.print("Idade: ");
			idades[i] = input.nextInt();
			
			System.out.print("Altura: ");
			alturas[i] = input.nextDouble();
			
			if (idades[i] < 16) {
				quantidadeMenores++;
			}
			
			soma += alturas[i];
			
		}
		
		System.out.println();
		
		float media = soma / quantidadeDigitada;
		System.out.printf("Altura média: %.2f%n", media);
		
		double porcentagemMenores = (quantidadeMenores * 100) / quantidadeDigitada;
		System.out.println("Pessoas com menos de 16 anos: "+porcentagemMenores+"%");
		
		for (int i = 0; i < quantidadeDigitada; i++) {
			
			if (idades[i] < 16) {
				System.out.println(nomes[i]);
			}	
		}
	}
}
