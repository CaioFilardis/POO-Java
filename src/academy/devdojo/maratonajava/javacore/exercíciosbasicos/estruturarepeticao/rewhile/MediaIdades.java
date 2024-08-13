package academy.devdojo.maratonajava.javacore.exercíciosbasicos.estruturarepeticao.rewhile;

import java.util.Scanner;

public class MediaIdades {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite as idades: ");
		
		int idades = input.nextInt(), nPessoas, contador = 0;
		float soma, media;
		
		if (idades < 0) {
			System.out.print("IMPOSSÍVEL CALCULAR");
		} else {
			
			soma = 0;
			nPessoas = 0;
			
			while (idades >= 0) {
				idades = input.nextInt();
				soma = soma + idades;
				contador++;
			} 	
			
			media = soma / contador; 
			System.out.printf("MEDIA = %.2f", media);
		}
	}
}