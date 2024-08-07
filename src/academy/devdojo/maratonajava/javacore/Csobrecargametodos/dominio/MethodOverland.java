package academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio;

public class MethodOverland {

    /* executando método */
    public static void main(String[] args) {
        System.out.printf("Square of integer 7 is: %d%n", square(7));
        System.out.printf("Square of integer 7.5 is: %.2f%n", square(7.5));
    }

    /* sobrecarregando métodos */
    public static int square(int intValue) {
        System.out.printf("%nCalled square with int argument: %d%n", intValue);
        return intValue * intValue;
    }

    public static double square(double doubleValue) {
        System.out.printf("%nCalled square with int argument: %.2f%n", doubleValue);
        return doubleValue * doubleValue;
    }
}
