package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Professor01 {
    private String name;
    private String especialidade;
    private Seminario[] seminarios;

    // construtor
    public Professor01(String name, String especialidade) {
        this.name = name;
        this.especialidade = especialidade;
    }

    // metodos
    public void imprime() {
        System.out.printf("Professor eh: %s%n", this.name);
        System.out.printf("Sua especialidade eh %s%n", this.especialidade);
        if (this.seminarios == null) return;

        System.out.println("---- Seminários cadastrados -----");
        for (Seminario seminario: this.seminarios) {
            System.out.println(seminario.getTitulo());
            System.out.println(seminario.getLocal().getEndereco());

            if (seminario.getAlunos() == null || seminario.getAlunos().length == 0) continue;
            System.out.println("--- Alunos ----");

            for (Aluno aluno: seminario.getAlunos()) {
                System.out.println("Aluno: "+ aluno.getName()+ " idade " + aluno.getIdade());
            }

        }
    }

    // atributos professor
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    // seminarios
    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
