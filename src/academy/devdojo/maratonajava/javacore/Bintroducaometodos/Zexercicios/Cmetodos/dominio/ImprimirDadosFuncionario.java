package academy.devdojo.maratonajava.javacore.Bintroducaometodos.Zexercicios.Cmetodos.dominio;

public class ImprimirDadosFuncionario {

    public void imprime(FuncionarioA funcionario) {
        System.out.println("Nome: "+funcionario.getNome());
        System.out.println("Idade: "+funcionario.getIdade());

        for (double salarios :funcionario.getSalario()) {
            System.out.print(salarios+" | ");
        }
    }
}
