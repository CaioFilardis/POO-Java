package academy.devdojo.maratonajava.javacore.Hherança.test;

import academy.devdojo.maratonajava.javacore.Hherança.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hherança.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hherança.dominio.Pessoa;

public class HerancaTest01 {

    public static void main(String[] args) {
        Endereco meuEndereco = new Endereco();
        meuEndereco.setRua("Rua N");
        meuEndereco.setCep("21741-160");

        Pessoa eu = new Pessoa("Caio");

        eu.setCpf("165.189.327-67");
        eu.setEndereco(meuEndereco);

        System.out.println("------ Pessoa ------");
        eu.imprime();

        Funcionario meuFuncionario = new Funcionario("Milena");
        meuFuncionario.setCpf("000.000.000-00");
        meuFuncionario.setEndereco(meuEndereco);
        meuFuncionario.setSalario(700.00);

        System.out.println("------ Funcionario ------");
        meuFuncionario.imprime();
    }
}
