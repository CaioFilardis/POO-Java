package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CaclculadoraTest05 {

    public static void main(String[] args) {
        Calculadora calcula = new Calculadora();
        int[] numeros = {21, 23, 3};
        calcula.somaArray(numeros);
        calcula.somaVarArgs(1,2,3,4);
    }
}
