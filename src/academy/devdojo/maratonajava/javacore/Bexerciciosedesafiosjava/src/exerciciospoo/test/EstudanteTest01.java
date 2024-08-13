package IntroducaoPOO.test;

import IntroducaoPOO.dominio.Estudante;

public class EstudanteTest01 {

    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.nome = "Caio";
        estudante1.idade = 23;
        estudante1.sexo = 'M';

        estudante2.nome = "Milena";
        estudante2.idade = 19;
        estudante2.sexo = 'F';

        estudante1.imprime();
        estudante2.imprime();

    }
}
