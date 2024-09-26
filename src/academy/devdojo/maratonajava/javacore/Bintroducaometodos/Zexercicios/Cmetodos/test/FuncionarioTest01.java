package academy.devdojo.maratonajava.javacore.Bintroducaometodos.Zexercicios.Cmetodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.Zexercicios.Cmetodos.dominio.FuncionarioA;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.Zexercicios.Cmetodos.dominio.ImprimirDadosFuncionario;

public class FuncionarioTest01 {

    public static void main(String[] args) {
        FuncionarioA funcionario = new FuncionarioA();
        ImprimirDadosFuncionario imprimir = new ImprimirDadosFuncionario();

        funcionario.nome = "Caio";
        funcionario.idade = 23;

        imprimir.imprime(funcionario);

        funcionario.calcularMediaSalarios(1700.50, 989.56, 2000.00);

    }
}
