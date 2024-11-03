package academy.devdojo.maratonajava.javacore.Gassocaicao.dominio;

public class Professor {

    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public void imprime() {
        System.out.println("Professor: "+this.nome);
        if (seminarios == null) return;
        System.out.println("## Seminarios cadastrados ##");
        for (Seminario listarSeminario:seminarios) {
            System.out.println(listarSeminario.getTitulo());
            System.out.println(listarSeminario.getLocal().getEndereco());
            if (listarSeminario.getAluno() == null || listarSeminario.getAluno().length == 0) continue;
            System.out.println("** Alunos **");
            for (Aluno aluno: listarSeminario.getAluno()) {
                System.out.println("Aluno "+aluno.getNome()+"Idade "+aluno.getIdade()+
                        "Seminario "+aluno.getSeminario());
            }
        }
        System.out.println();
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this(nome, especialidade);
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}