package academy.devdojo.maratonajava.javacore.Bintroducaoclasses.exercicios.test;

import academy.devdojo.maratonajava.javacore.Bintroducaoclasses.exercicios.dominio.Funcnionarios;

public class FuncionariosTest {

    public static void main(String[] args) {
        Funcnionarios funcionarios = new Funcnionarios();

        funcionarios.setNome("Caio");
        funcionarios.setIdade(23);
        funcionarios.setSalarios(new double[]{1700, 1500, 3500});

        funcionarios.imprimindoDados();
    }
}
