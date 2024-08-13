package exerciciosarrays;

import java.util.Scanner;

public class MaiorPosicao {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int maiorValor = 0, posicaoMenorValor = 0;
		
		System.out.print("Qauntos numeros voce vai digitar? ");
		int quantidadeDigitada = input.nextInt();
		
		int[] numeros = new int[quantidadeDigitada];
		
		for (int i = 0; i < quantidadeDigitada; i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = input.nextInt();
			
			if (maiorValor < numeros[i]) {
				maiorValor = numeros[i];
				posicaoMenorValor = i;
			}
		}
		
		System.out.println("\n\nMAIOR VALOR = "+maiorValor);
		System.out.println("POSICAO DO MAIOR VALOR = "+posicaoMenorValor);
	}
}
