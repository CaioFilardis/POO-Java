package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {

    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String estudio;

    public Anime(String nome, String tipo, int episodios,String genero) {
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    public Anime(String nome, String tipo, int episodios,String genero, String estudio) {
        this(nome, tipo, episodios, genero);
        this.estudio = estudio;
    }

    public Anime() {
        System.out.println("Dentro do construtor sem parâmetro");
    }

    public void imprimir() {
        System.out.println("Nome do anime: "+getNome());
        System.out.println("Tipo anime: "+getTipo());
        System.out.println("Quantidade episodios: "+getEpisodios());
        System.out.println("Gênero anime: "+getGenero());
        System.out.println("Estudio anime: "+getEstudio());
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getEpisodios() {
        return this.episodios;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
}
