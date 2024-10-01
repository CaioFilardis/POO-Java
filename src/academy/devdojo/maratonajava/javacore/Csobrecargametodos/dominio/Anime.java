package academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio;

public class Anime {

    private String nome;
    private String tipo;
    private int episodios;
    private String genero;

    public void init(String nome, String tipo, int episodios) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }

    public void init(String nome, String tipo, int episodios,String genero) {
        this.init(nome, tipo, episodios);
        this.genero = genero;
    }
    public void imprimir() {
        System.out.println("Nome do anime: "+getNome());
        System.out.println("Tipo anime: "+getTipo());
        System.out.println("Quantidade episodios: "+getEpisodios());
        System.out.println("Gênero anime: "+getGenero());
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
}
