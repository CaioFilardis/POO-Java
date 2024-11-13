package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Celular;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {

    public static void main(String[] args) {
        Computador computador = new Computador("Desktop", 2500.00);
        Tomate tomate = new Tomate("Legume", 7.7);
        Celular celular = new Celular("Samsung 50\"", 5000);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("============================");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("============================");
        CalculadoraImposto.calcularImposto(celular);
    }
}
