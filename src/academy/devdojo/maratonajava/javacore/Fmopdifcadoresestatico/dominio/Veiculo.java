package academy.devdojo.maratonajava.javacore.Fmopdifcadoresestatico.dominio;

public class Veiculo {

    private String marca;
    private String modelo;
    private double valor;
    private static int nivelLimiteEmissao;

    public Veiculo() {

    }

    public Veiculo(String marca, String modelo, double valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.valor = valor;
    }

    public Veiculo(String marca, String modelo, double valor, int nivelLimiteEmissao) {
        this(marca, modelo, valor);
        Veiculo.nivelLimiteEmissao = nivelLimiteEmissao;
    }

    public void imprimir() {
        System.out.println("Marca do veículo: "+ this.marca);
        System.out.println("Modelo do veículo: :"+this.modelo);
        System.out.println("Valor do veículo: "+this.valor);
        System.out.println("Nível de Emissão: "+Veiculo.nivelLimiteEmissao);
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return this.valor;
    }

    public static void setNivelLimiteEmissao(int nivelLimiteEmissao) {
        Veiculo.nivelLimiteEmissao = nivelLimiteEmissao;
    }

    public static int getNivelLimiteEmissao() {
        return Veiculo.nivelLimiteEmissao;
    }
}
