package academy.devdojo.maratonajava.javacore.Bintroducaometodos.Zexercicios.Aparametrosreferencia.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.Zexercicios.Aparametrosreferencia.dominio.Estoque;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.Zexercicios.Aparametrosreferencia.dominio.ProdutoA;

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
