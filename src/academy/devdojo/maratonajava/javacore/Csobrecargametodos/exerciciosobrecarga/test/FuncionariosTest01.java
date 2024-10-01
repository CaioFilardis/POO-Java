package academy.devdojo.maratonajava.javacore.Csobrecargametodos.exerciciosobrecarga.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.exerciciosobrecarga.dominio.Funcionario;

public class FuncionariosTest01 {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Caio");
        funcionario.setIdade(23);
        funcionario.setSalario(1700.50);

        funcionario.aumentarSalario(0.052, 59, 2);
    }
}
