package academy.devdojo.maratonajava.javacore.Bintroducaometodos.exercicios.dominio;

public class Quilometragem {

    public void imprimir(CarroA carro) {
        System.out.println("====================");
        System.out.println("Modelo do carro: "+carro.modelo);
        System.out.println("Ano do carro: "+carro.ano);
    }

    public void atualizar(CarroA carro) {
        double quilometrgemNova = 500;
        carro.quilometragem += quilometrgemNova;
    }
}
