package academy.devdojo.maratonajava.javacore.Bintroducaoclasses.exemploscurso1.test;

import academy.devdojo.maratonajava.javacore.Bintroducaoclasses.exemploscurso1.dominio.Calculadora;

public class CalculadoraTest01 {

    public static void main(String[] args) {
        Calculadora calcula = new Calculadora();

        calcula.somarDoisNumeros(10, 15);
        calcula.diminuirDoisNumeros(28, 7);
        calcula.multipliqueDoisNumeros(21, 13);

        double divisao = calcula.dividaDoisNumeros(255, 5);
        System.out.println("DIVISAO = "+ divisao);
    }
}
