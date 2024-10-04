package academy.devdojo.maratonajava.javacore.Fmopdifcadoresestatico.dominio;

public class Anime {

    private String nome;
    private static int[] episodios;

    // 0 - O bloco de inicialização estático é executado quando a JVM compila a classe
    // 1 - Alocamento de memória
    // 2 - Instanciação e inicialização dos atributos
    // 3 - Execução dos blocos de inicialização
    // 4 - Construtor é executado

    static  {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio:Anime.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

}
