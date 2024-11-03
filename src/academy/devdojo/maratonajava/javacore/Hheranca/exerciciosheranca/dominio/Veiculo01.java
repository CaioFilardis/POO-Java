package academy.devdojo.maratonajava.javacore.Hheranca.exerciciosheranca.dominio;

public class Veiculo01 {

    private String marca;
    private String modelo;

    public void exibir() {
        System.out.println("Marca: "+this.marca);
        System.out.println("Marca: "+this.modelo);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
