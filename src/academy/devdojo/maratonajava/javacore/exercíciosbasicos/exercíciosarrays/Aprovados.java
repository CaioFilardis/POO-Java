package exerciciosarrays;

import java.util.Scanner;

/*Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram 
no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir 
os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou 
igual a 6.0 (seis). */

public class Aprovados {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Quantos alunos serao digitados? ");
		int quantidadeAlunos = input.nextInt();
		
		String[] nomeAlunos = new String[quantidadeAlunos];
		float[] primeiraNota = new float[quantidadeAlunos];
		float[] segundaNota = new float[quantidadeAlunos];
		float[] somaNotas = new float[quantidadeAlunos];
		
		for (int i = 0; i < quantidadeAlunos; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %d° aluno: %n", i+1);
			
			nomeAlunos[i] = input.next();
			input.nextLine();
			primeiraNota[i] = input.nextFloat();
			segundaNota[i] = input.nextFloat();
		}
		
		
		
		System.out.println("Alunos aprovados");
		for (int i = 0; i < quantidadeAlunos; i++) {
			somaNotas[i] = (primeiraNota[i] + segundaNota[i]) / 2;
			//System.out.println(somaNotas[i]+"\n\n");
			
			if (somaNotas[i] >= 6) {
				System.out.println(nomeAlunos[i]);
			}
		}
	}
}
