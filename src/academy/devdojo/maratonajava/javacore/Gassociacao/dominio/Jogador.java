package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Jogador {
    private String name;
    private Time time;

    public Jogador(String name) {
        this.name = name;
    }

    public Jogador(Time time) {
        this.time = time;
    }

    public void imprime() {
        System.out.println(this.name);
        if (time != null) {
            System.out.println(time.getName());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
