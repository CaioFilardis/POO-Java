package academy.devdojo.maratonajava.javacore.Bintroducaoclasses.exemploscurso1.test;

import academy.devdojo.maratonajava.javacore.Bintroducaoclasses.exemploscurso1.dominio.Pessoa;

public class PessoaTest01 {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Caio Santos");
        System.out.println(pessoa.getNome());

        pessoa.setIdade(23);
        System.out.println(pessoa.getIdade());



    }
}
