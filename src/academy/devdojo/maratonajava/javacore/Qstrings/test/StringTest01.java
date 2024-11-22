package academy.devdojo.maratonajava.javacore.Qstrings.test;

public class StringTest01 {

    public static void main(String[] args) {
        String nome = "Caio"; // String constant pool
        String nome2 = "Caio";
        System.out.println(nome.equals(nome2)); // Compara Strings
        System.out.println(nome == nome2); // Compara a referência ao objeto String

        nome = nome.concat(" Santos"); // Faz referencia a String criada com cancatenação
        System.out.println(nome == nome2);

        String nome3 = new String("Caio"); // 1 variavel de referencia, 2 um objeto String, 3 uma string pool do objeto
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern()); // Pega a referencia do pool do String
    }

}
