package test;

import java.util.Scanner;

import dominio.Rectangle;

public class RectangleTest01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter the width and height of the rectangle: ");
		rectangle.width = input.nextDouble();
		rectangle.height = input.nextDouble();
		
		System.out.println(rectangle);
	}
}
