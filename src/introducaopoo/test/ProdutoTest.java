package academy.devdojo.maratonajava.javacore.Bintroducaoclasses.exercicios.test;

import academy.devdojo.maratonajava.javacore.Bintroducaoclasses.exercicios.dominio.Produto;

public class ProdutoTest {

    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.setNome("Whisky");
        System.out.println("Nome do produto = "+produto.getNome());
        produto.setCodigo(57);
        System.out.println("Código do produto =  "+produto.getCodigo());
        produto.setEstoque(-5);
        System.out.println("Quantidade de estoque = "+produto.getEstoque());
    }
}
