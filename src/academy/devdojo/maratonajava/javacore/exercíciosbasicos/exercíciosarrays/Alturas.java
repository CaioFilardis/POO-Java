package exerciciosarrays;

import java.util.Scanner;

public class Alturas {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int menor = 999, somaDosMenores = 0;
		float porcentagemMenores = 0;
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int quantidadeDigitada = input.nextInt();
		
		for (int i = 0; i < quantidadeDigitada; i++) {
			System.out.print("Dados da "+i+"a pessoas: ");
			System.out.print("Nome: ");
			String nome = input.nextLine();
			System.out.print("Idade: ");
			int idade = input.nextInt();
			System.out.print("Idade: ");
			float altura = input.nextFloat();
			
			if (idade < 16) {
				somaDosMenores += idade;
				String nomeMaisNovo = nome;
			}
			
		}
	}
}
