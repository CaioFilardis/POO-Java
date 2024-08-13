package IntroducaoPOO.dominio;

public class Retangulo {

    public double largura;
    public double altura;

    public void dobrarTamanho (Retangulo retangulo) {
        double dobrandoLargura = retangulo.largura * 2;
        double dobrandoAltura = retangulo.altura * 2;

        System.out.println("Largura Depois = "+dobrandoLargura);
        System.out.println("Altura Depois = "+dobrandoAltura);
    }
}
