package academy.devdojo.maratonajava.javacore.Gassocaicao.dominio;

public class Time {

    private String nome;
    private Jogador[] jogadores;

    public void imprime() {
        System.out.println(this.nome);
        if (jogadores == null) {
            return;
        }

        for (Jogador lista:jogadores) {
            System.out.println(lista.getNome());
        }
    }

    public Time(String nome) {
        this.nome = nome;
    }

    public Time(String nome, Jogador[] jogadores) {
        this(nome);
        this.jogadores = jogadores;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }
}
