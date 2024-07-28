package test;

import java.util.Scanner;

import dominio.Produto;

public class ProdutoTest {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Produto produto = new Produto();
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		produto.name = input.next();
		System.out.print("Price: ");
		produto.price = input.nextDouble();
		System.out.print("Quantity in stock: ");
		produto.quantity = input.nextInt();
		
		System.out.println("\nProduct data"+produto);
		
		System.out.print("\nEnter the number of product to be added in stock: ");
		int quantity = input.nextInt();
		produto.addProducts(quantity);
		
		System.out.println("\nUpdated data:"+produto);
		
		System.out.println("\nEnter the number of products to be removed from stock: ");
		quantity = input.nextInt();
		produto.removeProducts(quantity);
		
		System.out.println("\nUpdated data: "+produto);
		
	}
}
