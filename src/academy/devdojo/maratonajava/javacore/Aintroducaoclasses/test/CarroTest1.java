package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest1 {

    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.nome = "Impala 67";
        meuCarro.modelo = "Renult";
        meuCarro.ano = "1967";

        System.out.println(meuCarro.nome);
        System.out.println(meuCarro.modelo);
        System.out.println(meuCarro.ano);

        System.out.println("---------------------------");

        Carro seuCarro = new Carro();
        seuCarro.nome = "Onix";
        seuCarro.modelo = "Chevrolet";
        seuCarro.ano = "2013";

        System.out.println(seuCarro.nome);
        System.out.println(seuCarro.modelo);
        System.out.println(seuCarro.ano);


    }
}
