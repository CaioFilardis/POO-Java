package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {


    public static void calcularImposto(Produto produto) {
        System.out.println("-- Relatório dos produtos --");
        double imposto = produto.calcularImposto();
        System.out.println("Produto Nome: "+produto.getNome());
        System.out.println("Preço: R$ "+produto.getValor());
        System.out.printf("Imposto a pagar: R$ %.2f%n", imposto);
        if (produto instanceof Tomate) {
            String tomate = ((Tomate) produto).getDataValidade();
            System.out.println(tomate);
        }
    }
}
