package academy.devdojo.maratonajava.javacore.Gassocaicao.dominio;

public class Seminario {

    private String titulo;
    private Aluno[] aluno;
    private Local local;

    public void imprime() {
        System.out.println("Título do seminário: "+this.titulo);
        if (aluno == null) {
            return;
        }
        for (Aluno lista: aluno) {
            System.out.print(lista.getNome()+" ");
            System.out.println(lista.getIdade());
        }
        System.out.println(local.getEndereco());
        System.out.println();
    }

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario(String titulo, Aluno[] aluno) {
        this(titulo);
        this.aluno = aluno;
    }

    public Seminario(String titulo, Aluno[] aluno, Local local) {
        this(titulo, aluno);
        this.local = local;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAluno() {
        return aluno;
    }

    public void setAluno(Aluno[] aluno) {
        this.aluno = aluno;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
