package academy.devdojo.maratonajava.javacore.Bintroducaometodos.Zexercicios.Cmetodos.dominio;

public class FuncionarioA {

    public String nome;
    public int idade;
    public double[] salario;

    public void calcularMediaSalarios(double...salarios) {
        if (this.salario == null) {
            System.out.println("Defina um salário!");
            return;
        }
        double soma = 0;
        for (double somaSalarios:this.salario) {
           soma += somaSalarios;
        }
        double media = soma / this.salario.length;
        System.out.println("Média dos salários eh: "+media);
    }
}
