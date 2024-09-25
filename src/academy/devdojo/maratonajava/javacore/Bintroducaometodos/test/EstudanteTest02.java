package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest02 {

    public static void main(String[] args) {
        Estudante aluno01 = new Estudante();
        Estudante aluno02 = new Estudante();

        aluno01.name = "Midorya";
        aluno01.idade = 15;
        aluno01.sexo = 'M';

        aluno02.name = "Sakura";
        aluno02.idade = 16;
        aluno02.sexo = 'F';

        aluno01.imprimirEstudante();
        aluno02.imprimirEstudante();
    }
}
