package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest02 {
    // 0 - Bloco de inicalização estático da super classe é executado quando a JVM carregar a classe pai
    // 1 - Bloco de inicalização estático da sub classe é executada quando a JVM carregar a classe filha
    // 2 - Alocando memória para o objeto da superclasse
    // 3 - Cada atributo da superclasse é criado e inicalizado com valores default(padrão) ou o quer for passado da classe pai
    // 4 - Bloco de inicialização da superclasse é executado na ordem em que aparece
    // 5 - Contrutor é executado da superclasse
    // 6 - Alocando memória para o objeto da subclasse
    // 7 - Cadas atributo da subclasse é criadp e inicializado com valores default ou o quer for passado a subclasse
    // 8 - Bloco de inicialização da subclasse é executado na ordem em que aparece
    // 9 - Contrutor da subclasse é executado

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Jiraya");
    }
}
