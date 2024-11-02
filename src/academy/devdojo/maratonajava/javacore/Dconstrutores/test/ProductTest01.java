package test;

import java.util.Scanner;

import dominio.Product;

public class ProductTest01 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter product data: ");
		System.out.print("Name product: ");
		String name = sc.nextLine();
		System.out.print("Price product: ");
		Double price = sc.nextDouble();
		
		
		Product product = new Product(name, price);
		System.out.println(product);
		
		
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
	
		
		System.out.printf("\n\nUpadate data: %s, $ %.2f, %d units, Total: %.2f\n\n",
				product.getName(), product.getPrice(), product.getQuantity(), product.totalValueStock());
		
		System.out.print("Enter the number of products to be remove from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.printf("\nUpadate data: %s, $ %.2f, %d units, Total: %.2f",
				product.getName(), product.getPrice(), product.getQuantity(), product.totalValueStock());
		
		
	}
}
