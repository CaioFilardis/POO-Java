package academy.devdojo.maratonajava.javacore.Hheranca.exerciciosheranca.dominio;

public class Carro01 extends Veiculo01{

    private int ano;

    public void exibir() {
        super.exibir();
        System.out.println("Ano: "+this.ano);
    }
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
