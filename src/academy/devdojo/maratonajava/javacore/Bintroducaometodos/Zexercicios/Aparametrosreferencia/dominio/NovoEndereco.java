package academy.devdojo.maratonajava.javacore.Bintroducaometodos.Zexercicios.Aparametrosreferencia.dominio;

public class NovoEndereco {

    public void imprimir(PessoaA pessoa) {
        System.out.println("===============");
        System.out.println(pessoa.name);
        System.out.println(pessoa.yeas);
    }

    public void mudarEndereco(PessoaA pessoa) {
        System.out.println("Endereco antigo: "+pessoa.endereco);

        String novoEndereco = "Rua pacífico pereira";
        pessoa.endereco = novoEndereco;

    }
}
