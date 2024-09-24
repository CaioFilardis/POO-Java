package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {

    public static void main(String[] agrs) {
        Carro meuCarro =  new Carro();
        meuCarro.marca = "Toyoya";
        meuCarro.modelo = "Opala 65";
        meuCarro.ano = "1965";

        Carro seuCarro = new Carro();
        seuCarro.marca = "Honda";
        seuCarro.modelo = "HB20";
        seuCarro.ano = "2021";

        meuCarro = seuCarro;

        System.out.println("Marca: "+meuCarro.marca+"\nModelo: "+meuCarro.modelo+"\n Ano: "+meuCarro.ano);
        System.out.println("========\nMarca: "+seuCarro.marca+"\nModelo: "+seuCarro.modelo+"\nAno: "+seuCarro.ano);
    }
}
