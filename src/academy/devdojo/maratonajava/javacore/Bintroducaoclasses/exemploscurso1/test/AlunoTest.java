package academy.devdojo.maratonajava.javacore.Bintroducaoclasses.exemploscurso1.test;

import academy.devdojo.maratonajava.javacore.Bintroducaoclasses.exemploscurso1.dominio.Alunos;

public class AlunoTest {

    public static void main(String[] args) {
        Alunos aluno1 = new Alunos();
        Alunos aluno2 = new Alunos();
        ImprimindoALunos imprimir = new ImprimindoALunos();

        aluno1.nome = "Gohan";
        aluno1.idade = 23;
        aluno1.sexo = 'M';

        aluno2.nome = "Sakura";
        aluno2.idade = 18;
        aluno2.sexo = 'F';

        imprimir.imprime(aluno1);
        imprimir.imprime(aluno2);
    }
}
