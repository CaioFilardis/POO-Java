package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class ImprissoraEstudante {

    public void imprimirAlunos(Estudante aluno) {
        System.out.println("------------------");

        System.out.println(aluno.name);
        System.out.println(aluno.idade);
        System.out.println(aluno.sexo);
        aluno.name = "Gohan";
    }
}
