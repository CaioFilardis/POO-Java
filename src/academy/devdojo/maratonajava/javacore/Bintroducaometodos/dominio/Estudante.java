package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Estudante {

    public String name;
    public int idade;
    public char sexo;

    public void imprimirEstudante() {
        System.out.println("===============");
        System.out.println(this.name);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }
}
