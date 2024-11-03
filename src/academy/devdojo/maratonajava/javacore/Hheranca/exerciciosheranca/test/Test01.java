package academy.devdojo.maratonajava.javacore.Hheranca.exerciciosheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.exerciciosheranca.dominio.Aluno01;

public class Test01 {

    public static void main(String[] args) {
        Aluno01 aluno = new Aluno01();

        aluno.setNome("Caio");
        aluno.setIdade(23);
        aluno.setMatricula("255697");
        aluno.imprime();
    }
}
