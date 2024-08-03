package academy.devdojo.maratonajava.javacore.Dconstrutores.test;

import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Qualquer;

public class QualquerTest {

    public static void main(String[] args) {
        Qualquer qual = new Qualquer("Caio", "Masculino", 23);
        qual.imprime();
    }
}
