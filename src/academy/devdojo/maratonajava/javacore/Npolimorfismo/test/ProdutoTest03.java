package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {

    public static void main(String[] args) {
        Produto produto1 = new Computador("DELL", 45900);
        Produto produto2 = new Tomate("Tomatão do Zé", 3.56);

        CalculadoraImposto.calcularImposto(produto1);
        System.out.println();
        CalculadoraImposto.calcularImposto(produto2);
    }
}
