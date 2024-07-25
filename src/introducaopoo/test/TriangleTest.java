package Aintroducaopoo.test;

import Aintroducaopoo.dominio.Triangle;

import java.util.Scanner;

public class TriangleTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Triangle x, y, result;
        x = new Triangle();
        y = new Triangle();
        result = new Triangle();

        System.out.println("Enter the measures of triangle X:");
        x.a = input.nextDouble();
        x.b = input.nextDouble();
        x.c = input.nextDouble();

        System.out.println("Enter the measures of triangle Y:");
        y.a = input.nextDouble();
        y.b = input.nextDouble();
        y.c = input.nextDouble();

        System.out.printf("Triangle X area: %.4f%n", x.area());
        System.out.printf("Triangle Y area: %.4f%n", y.area());

        result.result(x.area(), x.area());
    }
}
