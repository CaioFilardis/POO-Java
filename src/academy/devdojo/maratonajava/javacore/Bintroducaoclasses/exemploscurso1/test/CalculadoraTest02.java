package academy.devdojo.maratonajava.javacore.Bintroducaoclasses.exemploscurso1.test;

import academy.devdojo.maratonajava.javacore.Bintroducaoclasses.exemploscurso1.dominio.Calculadora;

public class CalculadoraTest02 {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 = 1;
        int num2 = 2;

        calculadora.alteraDoisNumeros(num1, num2);
        System.out.println("Dentro do CalculadoraTest02");
        System.out.println("Num1 "+num1);
        System.out.println("Num2 "+num2);
    }
}
