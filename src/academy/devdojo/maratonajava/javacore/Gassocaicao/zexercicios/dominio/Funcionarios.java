package academy.devdojo.maratonajava.javacore.Gassocaicao.zexercicios.dominio;

public class Funcionarios {

    private String nome;
    private int idade;
    private double salario;
    private Departamento departamento;

    public Funcionarios(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public Funcionarios(String nome, int idade, double salario, Departamento departamento) {
        this(nome, idade, salario);
        this.departamento = departamento;
    }

    public void imprimir() {
        System.out.print(this.nome+" ");
        System.out.println(departamento.getNome());
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}
