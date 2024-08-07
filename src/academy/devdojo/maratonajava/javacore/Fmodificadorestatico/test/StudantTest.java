package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio.Studant;

public class StudantTest {

    public static void main(String[] args) {

        Studant.setCpf("165.189.327.67");
        System.out.println(Studant.getCpf());
    }
}
