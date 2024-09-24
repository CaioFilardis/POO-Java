package academy.devdojo.maratonajava.javacore.Bintroducaometodos.exercicios.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.exercicios.dominio.Estoque;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.exercicios.dominio.ProdutoA;

public class ProdutoATest01 {

    public static void main(String[] args) {
        ProdutoA produto = new ProdutoA();
        produto.quantidadeEstoque = 15;
        System.out.println("Estoque atual: "+ produto.quantidadeEstoque);

        Estoque estoque = new Estoque();
        estoque.atulizar(produto);
        System.out.println("Estoque atualizado: "+produto.quantidadeEstoque);
    }
}
