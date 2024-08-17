package academy.devdojo.maratonajava.javacore.Isobrescrita.dominio;

public class Time {

    private String nome;

    @Override // annotations
    public String toString() {
        return this.nome + " e o melhor time";
    }
    public Time(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
