package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Qualquer {
    private String nome;
    private String genero;
    private int idade;

    public Qualquer(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    public Qualquer(String nome, String genero, int idade) {
        this(nome, genero);
        this.idade = idade;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.genero);
        System.out.println(this.idade);
    }
}
