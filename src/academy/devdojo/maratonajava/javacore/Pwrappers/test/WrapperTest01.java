package academy.devdojo.maratonajava.javacore.Pwrappers.test;

public class WrapperTest01 {

    public static void main(String[] args) {
        // Tipos primitivos
        byte byteW = 1;
        short shortW = 1;
        int intW = 1;
        long longW = 1;
        float floatW = 1F;
        double doubleW = 1D;
        char charW= '1';
        boolean booleanW = false;

        // Classes Wrappers - Objetos
        // boxing
        Byte byteA = 1;
        Short shortA = 1;
        Integer intA= 1;
        Long longA = 1L;
        Float floatA = 1F;
        Double doubleA = 1D;
        Character charA = '1';
        Boolean booleanA = false;

        int i = intA; // unboxing
        Integer intW2 = Integer.parseInt("1"); // tornando um Integer em String
        boolean verdadeiro = Boolean.parseBoolean("TRUE");
        System.out.println(verdadeiro);

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));

        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isUpperCase('A')); // verifica se é maiusculo
        System.out.println(Character.isLowerCase('a')); // verifica se é minusculo
        System.out.println(Character.toUpperCase('a')); // torna o caracter minusculo
        System.out.println(Character.toLowerCase('A')); // torna o caracter minusculo
    }
}
