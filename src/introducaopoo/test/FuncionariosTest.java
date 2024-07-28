package test;

import java.util.Scanner;

import dominio.Funcionarios;

public class FuncionariosTest {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Funcionarios funcionarios = new Funcionarios();
		
		funcionarios.name = input.nextLine();
		System.out.printf("Nome: %s%n", funcionarios.name);
		
		funcionarios.grossSalary = input.nextDouble();
		System.out.printf("Salario bruto: %.2f%n", funcionarios.grossSalary);
		
		funcionarios.tax = input.nextDouble();
		System.out.printf("Imposto: %.2f%n", funcionarios.tax);
		
		funcionarios.netSalary();
		System.out.println(funcionarios);
		
		System.out.print("Qual a procentagem para aumentar o salario? ");
		double aumentoSalario = input.nextDouble();
		
		System.out.println();
		funcionarios.increaseSalary(aumentoSalario);
	}
}
