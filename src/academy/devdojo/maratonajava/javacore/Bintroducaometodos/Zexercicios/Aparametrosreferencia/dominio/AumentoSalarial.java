package academy.devdojo.maratonajava.javacore.Bintroducaometodos.Zexercicios.Aparametrosreferencia.dominio;

public class AumentoSalarial {

    public void imprimir(FuncionariosA funcionario) {
        System.out.println(funcionario.nome);
        System.out.println(funcionario.cargo);
    }

    public void aumentar(FuncionariosA funcionario) {
        double acrescimo = funcionario.salario * 0.1;
        funcionario.salario += acrescimo;
    }
}
