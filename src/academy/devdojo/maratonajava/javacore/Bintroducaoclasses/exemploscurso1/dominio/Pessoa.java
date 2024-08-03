package academy.devdojo.maratonajava.javacore.Bintroducaoclasses.exemploscurso1.dominio;

public class Pessoa {

    public String nome;
    public int idade;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        if (idade < 0) {
            System.out.println("Valor Inválido!");
            return 0;
        }
        return idade;
    }
}
