package academy.devdojo.maratonajava.javacore.Hheranca.exerciciosheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.exerciciosheranca.dominio.Funcionario01;
import academy.devdojo.maratonajava.javacore.Hheranca.exerciciosheranca.dominio.Gerente01;

public class Test04 {

    public static void main(String[] args) {
        Funcionario01 funcionario = new Funcionario01();
        funcionario.setNome("Caio");
        double salario = 1700.00;
        funcionario.setSalario(salario);
        funcionario.imprime();
        double percentual = 0.11;
        funcionario.aumentarSalario(percentual);
        System.out.println("==============");
        Gerente01 gerente = new Gerente01();
        gerente.setSalario(salario);
        gerente.aumentarSalario(percentual, 0.5);

    }
}
