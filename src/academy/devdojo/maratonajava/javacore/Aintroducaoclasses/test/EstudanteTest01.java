package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {

    public static void main(String[] args) {
        Estudante x;
        x = new Estudante();

        x.nome = "Caio";
        x.idade = 23;
        x.sexo = 'M';

        System.out.println(x.nome);
        System.out.println(x.idade);
        System.out.println(x.sexo);
    }
}
