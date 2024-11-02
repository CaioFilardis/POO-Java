package test;

import java.util.Scanner;

import dominio.CurrencyConverter;

public class CurrencyConverterTest01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is the value of the dollar? ");
		double valueDollar = input.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double quantityDollar = input.nextDouble();
		double result = CurrencyConverter.actualPayments(valueDollar, quantityDollar);
		
		System.out.printf("Amount to be paid in reais = %.2f%n", result);
	}
}
