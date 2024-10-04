package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Anime {

    private String nome;
    private int[] episodios;
    // Na instancição de um objeto
    // 1 - Alocamento de memória
    // 2 - Instanciação e inicialização dos atributos
    // 3 - Execução dos blocos de inicialização
    // 4 - Construtor é executado

    {
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
        System.out.println(episodios);
        for (int episodio:this.episodios) {
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

    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }
}
