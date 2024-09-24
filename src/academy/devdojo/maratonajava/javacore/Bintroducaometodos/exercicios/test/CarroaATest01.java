package academy.devdojo.maratonajava.javacore.Bintroducaometodos.exercicios.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.exercicios.dominio.CarroA;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.exercicios.dominio.Quilometragem;

public class CarroaATest01 {

    public static void main(String[] args) {
        CarroA carro = new CarroA();

        carro.modelo = "HR-V";
        carro.ano = 2020;
        carro.quilometragem = 5890.00;

        System.out.println("Modelo do carro: "+carro.modelo);
        System.out.println("Ano do carro: "+carro.ano);
        System.out.println("Quilometragem: "+carro.quilometragem);

        Quilometragem quilometros = new Quilometragem();
        quilometros.imprimir(carro);
        quilometros.atualizar(carro);


        System.out.println("Quilometragem atualizada: "+carro.quilometragem);
    }
}
