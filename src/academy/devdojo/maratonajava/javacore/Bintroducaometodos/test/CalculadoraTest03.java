package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.dividirDoisNumeros(20, 11);
        System.out.println(result);
        System.out.println("--------------");
        calculadora.dividirDoisNumeros(20, 2);
        System.out.println(calculadora.dividirDoisNumeros(20, 2));
        System.out.println("--------------");
        calculadora.imprimirDoisNumeros(80, 7);
    }
}
