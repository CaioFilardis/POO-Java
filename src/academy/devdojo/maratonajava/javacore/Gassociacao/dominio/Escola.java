package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Escola {
    private String name;
    private Professor[] professores; // uma escola com vários professores

    public Escola(String name) {
        this.name = name;
    }

    // sobrecarga
    public Escola(String name, Professor[] professores) {
        this.name = name;
        this.professores = professores;
    }

    public void imprime() {
        System.out.println(this.name);
        if (professores == null)
            return;
        for (Professor professor: professores) {
            System.out.println(professor.getName());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
