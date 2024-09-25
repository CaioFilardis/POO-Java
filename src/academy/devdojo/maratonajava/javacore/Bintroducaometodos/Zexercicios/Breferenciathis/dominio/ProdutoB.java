package academy.devdojo.maratonajava.javacore.Bintroducaometodos.Zexercicios.Breferenciathis.dominio;

public class ProdutoB {

    public String name;
    public double preco;
    public int quantidadeEstoque;

    public void exibirInformacoes() {
        System.out.println(this.name);
        System.out.println(this.preco);
        System.out.println(this.quantidadeEstoque);

        System.out.println("================");
    }
}
