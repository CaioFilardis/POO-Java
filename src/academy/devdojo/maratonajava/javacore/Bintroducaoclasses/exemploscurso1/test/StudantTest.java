package academy.devdojo.maratonajava.javacore.Bintroducaoclasses.exemploscurso1.test;

import academy.devdojo.maratonajava.javacore.Bintroducaoclasses.exemploscurso1.dominio.Studant;

public class StudantTest {

    public static void main(String[] args) {
        Studant studant = new Studant();
        PrintStudent imprime = new PrintStudent();

        studant.nome = "Gohan";
        studant.idade = 16;
        studant.sexo = 'M';

        imprime.print(studant);
    }
}
