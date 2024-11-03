package academy.devdojo.maratonajava.javacore.Hheranca.exerciciosheranca.dominio;

public class Funcionario01 {

    private String nome;
    private double salario;

    public void imprime() {
        System.out.printf("Salário: R$ %.2f%n", this.salario);
    }
    public void aumentarSalario(double percentual) {
        this.salario += (this.salario * percentual);
        System.out.printf("Novo salário = R$ %.2f%n", getSalario());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
