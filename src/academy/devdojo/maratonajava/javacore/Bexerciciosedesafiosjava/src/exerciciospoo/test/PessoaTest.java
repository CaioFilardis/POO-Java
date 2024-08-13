package IntroducaoPOO.test;

import IntroducaoPOO.dominio.Pessoa;

public class PessoaTest {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        AniversarioPessoa aniversario = new AniversarioPessoa();

        pessoa.idade = 23;

        System.out.println("Idade antes = "+pessoa.idade);
        aniversario.anive(pessoa);
    }
}
