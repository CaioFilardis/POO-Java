package IntroducaoPOO.test;

import IntroducaoPOO.dominio.Calculo;

public class CalculoTest {

    public static void main(String[] args) {
        Calculo calculo = new Calculo();
        int[] numeros = {1, 2, 3, 4, 5};
        calculo.somarArray(numeros);
    }
}
