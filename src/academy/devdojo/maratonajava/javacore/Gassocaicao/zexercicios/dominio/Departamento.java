package academy.devdojo.maratonajava.javacore.Gassocaicao.zexercicios.dominio;

public class Departamento {

    private String nome;
    private int numeroFuncionarios;
    private Funcionarios[] funcionario;

    public Departamento(String nome, int numeroFuncionarios) {
        this.nome = nome;
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public Departamento(String nome, int numeroFuncionarios, Funcionarios[] funcionario) {
        this(nome, numeroFuncionarios);
        this.funcionario = funcionario;
    }

    public void imprime() {
        System.out.println(this.nome);
        if (funcionario == null) {
            return;
        }
        for (Funcionarios lista:funcionario) {
            System.out.println(lista.getNome());
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNumeroFuncionarios(int numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public int getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public Funcionarios[] getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionarios[] funcionario) {
        this.funcionario = funcionario;
    }
}
