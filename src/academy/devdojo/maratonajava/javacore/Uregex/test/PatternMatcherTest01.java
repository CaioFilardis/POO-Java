package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {

    public static void main(String[] args) {
        // Expressão regulares utilizam simbolos para representar os caracteres de um link
        // Serve para captura de meta caracteres, como de links, emails, ...
        // serve com uma procura
        String regex = "aba";
        //String texto = "abaaba";
        String texto2 = "abababa";

        // Classe Pattern
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto:  "+texto2);
        System.out.println("indice: 0123456789");
        System.out.println("regex "+regex);
        System.out.println("Posicoes encontradas");

        while(matcher.find()) {
            System.out.println(matcher.start()+" ");
        }
    }
}
