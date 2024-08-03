package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Equipe;

public class EquipeTest01 {

    public static void main(String[] args) {
        Equipe professor = new Equipe();
        professor.nome = "Antonio";
        professor.idade = 25;
        professor.sexo = 'M';
        System.out.println(professor.nome);
        System.out.println(professor.idade);
        System.out.println(professor.sexo);

        Equipe diretor = new Equipe();
        diretor.nome = "Naruto";
        diretor.idade = 16;
        diretor.sexo = 'M';
        System.out.println(diretor.nome);
        System.out.println(diretor.idade);
        System.out.println(diretor.sexo);
    }
}
