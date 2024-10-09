package academy.devdojo.maratonajava.javacore.Gassocaicao.test;

import academy.devdojo.maratonajava.javacore.Gassocaicao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassocaicao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassocaicao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassocaicao.dominio.Seminario;

public class CadastroTest01 {

    public static void main(String[] args) {
        Local local = new Local("Jardim Sulacap");
        Aluno aluno = new Aluno("Naruto", 23);
        Professor professor = new Professor("Jiraya", "Tarado");
        Aluno[] alunosParaSeminario = {aluno};

        Seminario seminario = new Seminario("Se tornar Hokage", alunosParaSeminario, local);
        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);
        professor.imprime();
    }
}
