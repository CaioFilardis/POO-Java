package IntroducaoPOO.test;

import IntroducaoPOO.dominio.Pessoa;

public class AniversarioPessoa {

    public void anive (Pessoa pessoa) {
        int idade = pessoa.idade;
        idade++;
        System.out.println("Idade depois = "+idade);
    }
}
