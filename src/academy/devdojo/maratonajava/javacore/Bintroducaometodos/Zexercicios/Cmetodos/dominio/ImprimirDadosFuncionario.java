package academy.devdojo.maratonajava.javacore.Bintroducaometodos.Zexercicios.Cmetodos.dominio;

public class ImprimirDadosFuncionario {

    public void imprime(FuncionarioA funcionario) {
        System.out.println("Nome: "+funcionario.nome);
        System.out.println("Idade: "+funcionario.idade);

        for (double salarios :funcionario.salario) {
            System.out.println("Salarios: "+salarios);
        }
    }
}
