package IntroducaoPOO.test;

import IntroducaoPOO.dominio.Funcionario;

public class FuncionarioTest {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        ImpressoraFuncionario impresora = new ImpressoraFuncionario();

        funcionario.nome = "Caio";
        funcionario.idade = 23;
        funcionario.salario = 1700.00;

        impresora.imprimir(funcionario);
    }
}
