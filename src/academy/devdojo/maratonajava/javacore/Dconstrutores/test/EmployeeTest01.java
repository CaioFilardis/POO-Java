package test;

import java.util.Scanner;

import dominio.Employee;

public class EmployeeTest01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Employee employee = new Employee();
		
		System.out.print("Name: ");
		employee.name = input.nextLine();
		System.out.print("Gross salary: ");
		employee.grossSalary = input.nextDouble();
		System.out.print("Tax: ");
		employee.tax = input.nextDouble();
		
		System.out.println(employee);
		
		System.out.print("What is the percentage to increase the salary? ");
		double percentage = input.nextDouble();
		
		employee.increaseSalary(percentage);
		
	}
}
