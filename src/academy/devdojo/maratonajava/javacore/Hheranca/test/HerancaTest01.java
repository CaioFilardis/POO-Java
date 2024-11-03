package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {

    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua pacícfico pereira, 1");
        endereco.setCep("21741-160");

        Pessoa pessoa = new Pessoa("Caio");
        pessoa.setCpf("165.189.327-67");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Naruto");
        funcionario.setCpf("11111111111");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2280.00);
        System.out.println("=================");
        funcionario.imprime();
    }
}
