package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor01;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTest {

    public static void main(String[] args) {
        Local local = new Local("Rio de Janeiro");
        Aluno aluno = new Aluno("Caio", 23);
        Professor01 professor01 = new Professor01("Willian", "Java");
        Aluno[] alunos = {aluno};
        Seminario seminario = new Seminario("Progamação", alunos, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor01.setSeminarios(seminariosDisponiveis);
        professor01.imprime();
    }
}
