package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.test;

import academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio.Desenho;

public class DesenhoTest01 {

    public static void main(String[] args) {
        Desenho desenho = new Desenho();

       for (int episodio: desenho.getEpisodios()) {
           System.out.print(episodio+" ");
       }
    }
}
