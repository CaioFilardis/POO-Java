package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {

    public static void main(String[] args) {
        Calculadora calcular = new Calculadora();
        calcular.somarDoisNumeros();
        System.out.println("Finalizando a soma");
        calcular.subtrairDoisNumeros();
    }
}
