package academy.devdojo.maratonajava.javacore.Bintroducaoclasses.exemploscurso1.test;

import academy.devdojo.maratonajava.javacore.Bintroducaoclasses.exemploscurso1.dominio.Alunos;

import java.util.Scanner;



public class AlunosTest {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Alunos aluno = new Alunos();
		
		aluno.name = input.nextLine();
		aluno.firstNote = input.nextDouble();
		aluno.secondNote = input.nextDouble();
		aluno.thirdNote = input.nextDouble();
		
		System.out.println("NOTA FINAL = "+aluno.noteFinal());
		
		aluno.resultFinal(aluno.noteFinal());
	}
}
