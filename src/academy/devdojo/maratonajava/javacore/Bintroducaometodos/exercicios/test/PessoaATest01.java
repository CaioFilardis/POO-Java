package academy.devdojo.maratonajava.javacore.Bintroducaometodos.exercicios.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.exercicios.dominio.NovoEndereco;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.exercicios.dominio.PessoaA;

public class PessoaATest01 {

    public static void main(String[] args) {
        PessoaA pessoa = new PessoaA();

        pessoa.name = "Caio";
        pessoa.yeas = 23;
        pessoa.endereco = "Avenida Marechal Fontenelle";


        NovoEndereco endereco = new NovoEndereco();
        endereco.imprimir(pessoa);
        endereco.mudarEndereco(pessoa);

        System.out.println("Novo endereco: "+pessoa.endereco);

    }
}
