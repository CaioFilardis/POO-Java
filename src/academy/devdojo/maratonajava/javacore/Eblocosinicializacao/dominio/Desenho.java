package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Desenho {
    private String name;
    private int[] episodios = {1, 2, 3, 4, 5 ,6};
    /* bloco de inicialização */
    {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    /* construtor */
    public Desenho(String name) {
        this.name= name;
    }

    /* construtor */
    public Desenho() {
        for (int episodio: this.episodios) {
            System.out.print(episodio+" ");
        }
        System.out.println();
    }

    /* método get*/
    public String getName() {
        return name;
    }

    public int[] getEpisodios() {
        return episodios;
    }

}
