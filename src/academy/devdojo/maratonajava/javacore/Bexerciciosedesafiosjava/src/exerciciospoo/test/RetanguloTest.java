package IntroducaoPOO.test;

import IntroducaoPOO.dominio.Retangulo;

public class RetanguloTest {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        Retangulo chamando = new Retangulo();

        retangulo.largura = 25.5;
        retangulo.altura = 30.5;

        System.out.println("Lagura Antes = "+retangulo.largura);
        System.out.println("Altura Depois = "+retangulo.altura);

        chamando.dobrarTamanho(retangulo);

    }
}
