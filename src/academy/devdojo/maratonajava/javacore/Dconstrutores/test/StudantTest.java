package test;

import java.util.Scanner;

import dominio.Student;

public class StudantTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Student student = new Student();
		
		student.name = input.nextLine();
		student.nota1 = input.nextDouble();
		student.nota2 = input.nextDouble();
		student.nota3 = input.nextDouble();
		
		student.finalNote();
	}
}
