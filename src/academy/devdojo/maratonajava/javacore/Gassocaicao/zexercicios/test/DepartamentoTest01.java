package academy.devdojo.maratonajava.javacore.Gassocaicao.zexercicios.test;

import academy.devdojo.maratonajava.javacore.Gassocaicao.zexercicios.dominio.Departamento;
import academy.devdojo.maratonajava.javacore.Gassocaicao.zexercicios.dominio.Funcionarios;

public class DepartamentoTest01 {

    public static void main(String[] args) {

        Funcionarios funcionario1 = new Funcionarios("Caio", 23, 17700);
        Funcionarios funcionario2 = new Funcionarios("Lobo", 45, 2888);
        Funcionarios funcionario3 = new Funcionarios("Danilo", 42, 6670);
        Funcionarios[] funcionarios = {funcionario1, funcionario2, funcionario3};

        Departamento departamento = new Departamento("TI", 4, funcionarios);

        departamento.setFuncionario(funcionarios);
        departamento.imprime();
    }
}
