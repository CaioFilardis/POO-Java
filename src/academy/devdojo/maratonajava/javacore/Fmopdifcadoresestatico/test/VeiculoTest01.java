package academy.devdojo.maratonajava.javacore.Fmopdifcadoresestatico.test;

import academy.devdojo.maratonajava.javacore.Fmopdifcadoresestatico.dominio.Veiculo;

public class VeiculoTest01 {

    public static void main(String[] args) {
        Veiculo meuVirculo = new Veiculo("BMW", "RV-16", 150000);

        Veiculo.setNivelLimiteEmissao(15);
        meuVirculo.imprimir();
    }
}
