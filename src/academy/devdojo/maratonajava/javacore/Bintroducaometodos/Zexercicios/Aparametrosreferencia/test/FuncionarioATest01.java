package academy.devdojo.maratonajava.javacore.Bintroducaometodos.Zexercicios.Aparametrosreferencia.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.Zexercicios.Aparametrosreferencia.dominio.AumentoSalarial;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.Zexercicios.Aparametrosreferencia.dominio.FuncionariosA;

public class FuncionarioATest01 {

    public static void main(String[] args) {
        FuncionariosA funcionario = new FuncionariosA();

        funcionario.nome = "Caio";
        funcionario.cargo = "Estagiário";
        funcionario.salario = 1649.59;

        System.out.println("Salário Atual: "+funcionario.salario);

        AumentoSalarial salario = new AumentoSalarial();
        salario.imprimir(funcionario);
        salario.aumentar(funcionario);

        System.out.printf("Salário atualizado: %.2f", funcionario.salario);
    }
}
