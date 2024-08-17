package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio;

public final class Carro {

    private String fabricante;
    private static final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    /*   // ou esse
    {
        VELOCIDADE_LIMITE = 250;
    } */
}
