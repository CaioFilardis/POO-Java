package exerciciospoo.dominio;

public class Funcnionarios {

    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public void imprimindoDados() {
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        if (salarios == null) {
        }
        for (double salario : salarios) {
            System.out.print(salario+" ");
        }
        mediaSalarios();
    }

    public void mediaSalarios() {
        if (salarios == null) {
            return;
        }
        for (double numeros : salarios) {
            media += numeros;
        }
        media = media / salarios.length;
        System.out.println("\nMedia dos salarios: "+ media);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getMedia() {
        return media;
    }
}
