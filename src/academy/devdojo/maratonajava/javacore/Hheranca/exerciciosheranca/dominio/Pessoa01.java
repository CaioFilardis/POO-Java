package academy.devdojo.maratonajava.javacore.Hheranca.exerciciosheranca.dominio;

public class Pessoa01 {

    private String nome;
    private int idade;

    public void imprime() {
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
