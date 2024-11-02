package test;

import java.util.Scanner;

import dominio.Bill;

public class BillTest01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Bill bill = new Bill();
		
		System.out.print("Gender: ");
		bill.gender = input.next().charAt(0);
		System.out.print("Quantity the beer: ");
		bill.beer = input.nextInt();
		System.out.print("Quantity the softdrink: ");
		bill.softDrink = input.nextInt();
		System.out.print("Quantity the barbecue: ");
		bill.barbecue = input.nextInt();
		
		System.out.println();
		System.out.println("RELATÓRIO: ");
		System.out.printf("Cover = R$ %.2f%n", bill.cover());
		if (bill.feeding() == 0) {
			System.out.println("Exempt from cover charge");
		} else {
			System.out.printf("Couvert = R$ %.2f%n", bill.feeding());
		}
		System.out.printf("Ticket = R$ %.2f%n", bill.ticket());
		System.out.println();
		System.out.printf("Amount to play: R$ %.2f", bill.total());
		
	}
}
