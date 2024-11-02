package test;

import java.util.Scanner;

import dominio.Calculator;

public class CalculatorTest01 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = input.nextDouble();
		
		double circumference = Calculator.circumference(radius);
		double volume = Calculator.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", circumference);
		System.out.printf("Volume: %.2f%n", volume);
		System.out.printf("PI: %.2f%n", Calculator.PI);
	}
}
