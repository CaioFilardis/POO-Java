package academy.devdojo.maratonajava.javacore.Bintroducaometodos.Zexercicios.Breferenciathis.dominio;

public class Carrinho {

    public int listaProdutos;

    // Arrays
    public void adicionar(int listaProdutos) {
        this.listaProdutos += listaProdutos;
    }

    public void remover() {
        this.listaProdutos -= listaProdutos;
        }
    }
    // VarArgs
    /* public void adicionar(int... item) {
        for (int itens:item) {
            System.out.println(itens);
        }
    } */

