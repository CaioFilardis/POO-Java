package academy.devdojo.maratonajava.javacore.Hheranca.exerciciosheranca.dominio;

public class Eletronico01 extends Produto01{

    private String marca;

    public Eletronico01() {
        super();
    }

    public Eletronico01(String nome, double preco, String marca) {
        super(nome, preco);
        this.marca = marca;
    }

    public void imprime() {
        super.imprime();
        System.out.println("Marca = "+this.marca);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
