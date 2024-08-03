package introducaopoo.constrtutores.dominio;

public class Formatacao {
    private String texto;
    private int tamanho;
    private char caractere;

    public void formatar(String texto) {
        this.texto = texto;
    }

    public void formatar(String texto, int tamanho) {
        formatar(texto);
        this.tamanho = tamanho;
    }

    public void formatar(String texto, int tamanho, char caractere) {
        formatar(texto, tamanho);
        this.caractere = caractere;
    }

    public void imprime() {
        System.out.println(this.texto);
        System.out.println(this.tamanho);
        System.out.println(this.caractere);
    }



}
