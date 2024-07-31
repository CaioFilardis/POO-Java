package academy.devdojo.maratonajava.javacore.Bintroducaoclasses.exercicios.dominio;

public class Produto {
    String nome;
    int codigo;
    int estoque;


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setEstoque(int estoque) {
        if (estoque < 0) {
            System.out.println("Negativos não permitidos");
        } else {
            this.estoque = estoque;
        }
    }

    public int getEstoque() {
        return estoque;
    }
}
