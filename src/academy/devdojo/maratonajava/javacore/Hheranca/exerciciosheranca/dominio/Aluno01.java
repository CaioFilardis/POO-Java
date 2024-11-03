package academy.devdojo.maratonajava.javacore.Hheranca.exerciciosheranca.dominio;

public class Aluno01 extends Pessoa01{

    private String matricula;

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
