package academy.devdojo.maratonajava.javacore.Bintroducaometodos.Zexercicios.Cmetodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.Zexercicios.Cmetodos.dominio.FuncionarioA;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.Zexercicios.Cmetodos.dominio.ImprimirDadosFuncionario;

public class FuncionarioTest01 {

    public static void main(String[] args) {
        FuncionarioA funcionario = new FuncionarioA();
        ImprimirDadosFuncionario imprimir = new ImprimirDadosFuncionario();
        double[] salarios = {1700.50, 989.56, 2000.00};

        funcionario.setNome("Caio");
        funcionario.setIdade(23);
        funcionario.setSalario(salarios);

        imprimir.imprime(funcionario);
        funcionario.calcularMediaSalarios();



    }
}
