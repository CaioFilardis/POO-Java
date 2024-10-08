package academy.devdojo.maratonajava.javacore.Fmopdifcadoresestatico.test;

import academy.devdojo.maratonajava.javacore.Fmopdifcadoresestatico.dominio.Carro;

public class CarroTest01 {

    public static void main(String[] args) {
        Carro meuCarro = new Carro("BMW", 280);
        Carro seuCarro = new Carro("Mercedes", 275);
        Carro outroCarro = new Carro("Audi", 290);

        meuCarro.imprime();
        seuCarro.imprime();
        outroCarro.imprime();

        System.out.println("=======================");

        Carro.setVelocidadeLimite(150);

        meuCarro.imprime();
        seuCarro.imprime();
        outroCarro.imprime();
    }
}
