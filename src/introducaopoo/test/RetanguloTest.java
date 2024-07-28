package test;

import java.util.Scanner;

import dominio.Retangulo;

public class RetanguloTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Entre coom a largura e altura do retangulo:");
		retangulo.width = input.nextDouble();
		retangulo.height = input.nextDouble();
		
		System.out.println("AREA = "+retangulo.area());
		System.out.println("PERIMETRO = "+retangulo.perimeter());
		System.out.println("DIAGONAL = "+retangulo.diagonal());
		
	}
}
