package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Local local;

    // construtor
    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    // sobrecarga
    public Seminario(String titulo,  Aluno[] alunos) {
        this.titulo = titulo;
        this.alunos = alunos;
    }

    // sobrecarga
    public Seminario(String titulo,  Aluno[] alunos, Local local) {
        this(titulo, alunos);
        this.local = local;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
