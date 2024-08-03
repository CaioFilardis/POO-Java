package academy.devdojo.maratonajava.javacore.Bintroducaoclasses.exemploscurso1.test;

import academy.devdojo.maratonajava.javacore.Bintroducaoclasses.exemploscurso1.dominio.Calculadora;

public class CalculadoraTest03 {

    public static void main(String[] args) {
        Calculadora cacluladora = new Calculadora();

        int[] numeros = {1, 2, 3, 4, 5};

        cacluladora.somarArrays(numeros);
    }
}
