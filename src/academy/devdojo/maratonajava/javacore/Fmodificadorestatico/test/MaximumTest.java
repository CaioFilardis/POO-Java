package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio.Maximum;

import java.util.Scanner;

public class MaximumTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three floating-poit values separated by spaces:");
        Maximum.number1 = input.nextDouble();
        Maximum.number2 = input.nextDouble();
        Maximum.number3 = input.nextDouble();

        double result  = Maximum.number1 + Maximum.number2 + Maximum.number3;

        System.out.println("Maximum is: "+result);
    }
}
