package academy.devdojo.maratonajava.javacore.Hheranca.exerciciosheranca.dominio;

public class Aluno01 extends Pessoa01{

    private String matricula;


    public Aluno01() {
    }

    public Aluno01(String nome, String matricula) {
        super(nome);
        this.matricula = matricula;
    }
    // sobreescrevendo
    public void imprime() {
        super.imprime();
        System.out.println("Matrícula: "+this.matricula);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
