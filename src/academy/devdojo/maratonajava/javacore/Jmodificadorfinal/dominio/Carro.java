package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio;

public class Carro {

    private String nome;
    public static final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();

    /* public static final double VELOCIDADE_LIMITE;

    static {
        VELOCIDADE_LIMITE = 250;
    }*/

    // ou

    /*public final double VELOCIDADE_LIMITE;
       {
            VELOCIDADE_LIMITE = 250;
       }
       */

    public Carro() {
    }

    public Carro(String nome) {
        this.nome = nome;
    }

    public final void imprime() {
        System.out.println(this.nome);
        System.out.println(this.COMPRADOR);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String toString() {
        return "Nome: "
                +this.nome
                +"\nVelocidade Limite: "
                +VELOCIDADE_LIMITE;

    }
}
