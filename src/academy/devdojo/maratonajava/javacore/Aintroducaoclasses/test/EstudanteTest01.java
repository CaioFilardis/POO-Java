package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {

    public static void main(String[] args) {
        Estudante estudante = new Estudante(); // intância do objeto
        estudante.name = "Caio";
        estudante.idade = 23;
        estudante.sexo = 'M';

        System.out.println(estudante.name);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
