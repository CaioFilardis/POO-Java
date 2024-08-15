package academy.devdojo.maratonajava.javacore.Hherança.dominio;

public class Pessoa {

    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    public void imprime() {
        System.out.printf("Nome: %s%n", this.nome);
        System.out.printf("CPF: %s%n", this.cpf);
        System.out.printf("Endereco: %s - %s%n", this.nome, this.endereco.getCep());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
