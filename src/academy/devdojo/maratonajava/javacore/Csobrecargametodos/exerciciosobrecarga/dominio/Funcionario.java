package academy.devdojo.maratonajava.javacore.Csobrecargametodos.exerciciosobrecarga.dominio;

public class Funcionario {

    private String nome;
    private int idade;
    private double salario;
    // atributos adicionais
    private double percentual;
    private double valor;
    private int anos;

    public  void aumentarSalario(double percentual) {
        double salarioPosPercentual = percentual * this.salario;
        percentual = salarioPosPercentual + this.salario;
        System.out.println("Salário aumentado: " + percentual);
    }

    public void aumentarSalario(double percentual, double valor) {
        this.aumentarSalario(percentual);
        valor += this.salario;
        System.out.println("Valor adicional: "+valor);
    }

    public void aumentarSalario(double percentual, double valor, int anos) {
        this.aumentarSalario(percentual, valor);
        anos *= this.salario;
        System.out.println("Valor aumentado em anos: "+anos);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
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

    public double getPercentual() {
        return percentual;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getAnos() {
        return anos;
    }

    public void setAnos(int anos) {
        this.anos = anos;
    }
}
