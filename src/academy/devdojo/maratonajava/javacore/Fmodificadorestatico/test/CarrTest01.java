package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio.Carr;

public class CarrTest01 {

    public static void main(String[] args) {

        System.out.println(Carr.limitedSpeed);
        Carr.setLimitedSpeed(300);
        System.out.println(Carr.getLimitedSpeed());


    }
}
