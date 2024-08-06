package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Desenho {
    private String name;
    private static int[] episodios = {1, 2, 3, 4, 5 ,6};

    /* bloco de inicialização estático*/
    static {
        System.out.println("Dentro do bloco de inicialização 1");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    static {
        System.out.println("Dentro do bloco de inicialização 2");
    }

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

    /* métodos get */
    public String getName() {
        return name;
    }

    public int[] getEpisodios() {
        return episodios;
    }

}
