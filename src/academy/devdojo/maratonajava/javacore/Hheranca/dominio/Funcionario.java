package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa{

    private double salario;

    static {
        System.out.println("Dentro do bloco estático de funcionario");
    }
    {
        System.out.println("Bloco de inicialização não estático funcionario 1");
    }
    {
        System.out.println("Bloco de inicialização não estático funcionario 2");
    }



    public Funcionario(String nome, String cpf, double salario) {
        super(nome, cpf);
        this.salario = salario;
        System.out.println("Dentro do contrutor Funcionario 1");
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do contrutor Funcionario");
    }
    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioPagamento() {
        System.out.println("Eu: "+this.nome+" recebi o salario de: "+this.salario);
    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
