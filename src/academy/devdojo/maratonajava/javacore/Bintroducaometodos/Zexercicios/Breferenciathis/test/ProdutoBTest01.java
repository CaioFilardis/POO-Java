package academy.devdojo.maratonajava.javacore.Bintroducaometodos.Zexercicios.Breferenciathis.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.Zexercicios.Breferenciathis.dominio.ProdutoB;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.Zexercicios.Breferenciathis.dominio.CalcularValorTotal;

public class ProdutoBTest01 {

    public static void main(String[] args) {
        ProdutoB produtoA = new ProdutoB();
        ProdutoB produtoB = new ProdutoB();
        CalcularValorTotal total = new CalcularValorTotal();

        produtoA.name = "Desodorante";
        produtoA.preco = 3.67;
        produtoA.quantidadeEstoque = 3;

        produtoB.name = "Sabão";
        produtoB.preco = 1.89;
        produtoB.quantidadeEstoque = 10;

        produtoA.exibirInformacoes();
        produtoB.exibirInformacoes();

        System.out.printf("Valor total produto A: R$ %.2f%n", total.valorTotal(produtoA));
        System.out.printf("Valor total produto b: R$ %.2f%n", total.valorTotal(produtoB));
    }
}
