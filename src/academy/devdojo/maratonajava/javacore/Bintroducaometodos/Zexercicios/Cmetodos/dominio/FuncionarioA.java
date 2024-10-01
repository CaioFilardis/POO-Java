package academy.devdojo.maratonajava.javacore.Bintroducaometodos.Zexercicios.Cmetodos.dominio;

public class FuncionarioA {

    private String nome;
    private int idade;
    private double[] salario;
    private double media;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public double getMedia() {
        return media;
    }

    public void calcularMediaSalarios(double...salarios) {
        if (this.salario == null) {
            System.out.println("Defina um salário!");
            return;
        }
        double soma = 0;
        for (double somaSalarios:this.salario) {
           soma += somaSalarios;
        }
        media = soma / this.salario.length;
        System.out.printf("\nMédia dos salários eh: %.2f%n", media);
    }
}
