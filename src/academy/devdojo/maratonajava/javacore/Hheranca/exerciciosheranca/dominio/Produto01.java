package academy.devdojo.maratonajava.javacore.Hheranca.exerciciosheranca.dominio;

public class Produto01 {

    private String nome;
    private double preco;

    public Produto01() {
    }

    public Produto01(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void imprime() {
        System.out.println("========== Produto ============");
        System.out.println("Nome: "+this.nome);
        System.out.println("Preço: R$ "+this.preco);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
