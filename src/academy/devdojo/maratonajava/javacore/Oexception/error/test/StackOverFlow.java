package academy.devdojo.maratonajava.javacore.Oexception.error.test;

public class StackOverFlow {

    // simulando error de StackOverFlow, utilizando recursividade
    public static void main(String[] args) {
        recursividade();
    }

    public static void recursividade() {
        recursividade();
    }
}
