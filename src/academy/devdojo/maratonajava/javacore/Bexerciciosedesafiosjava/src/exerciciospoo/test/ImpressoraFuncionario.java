package IntroducaoPOO.test;

import IntroducaoPOO.dominio.Funcionario;

public class ImpressoraFuncionario {

    public void imprimir(Funcionario funcionario) {
        System.out.println(funcionario.nome);
        System.out.println(funcionario.idade);
        System.out.println(funcionario.salario);
    }
}
