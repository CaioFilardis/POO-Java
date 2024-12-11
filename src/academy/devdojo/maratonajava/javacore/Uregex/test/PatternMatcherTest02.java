package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {

    public static void main(String[] args) {
         // \\d = Todos os dígitos
        // \\D = Tudo o que não for dígito
        // \\s = Espaços em brnaco: \t \n \f \r
        // \\S = Todos os caracteres, excluindo os brancos
        // \\w = Tudo que for de a-z, dígitos e '_'
        // \\W = Tudo que não for a-z, díigots e '_'
        // [] =
        // String regex = "[0x-zA-C]";
        String regex = "0[xX][0-9a-fA-F]";
        //String texto = "abaaba";
        String texto2 = "12 0x 0x 0xFFABC 0x109 0x1";

        // Classe Pattern
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto:  "+texto2);
        System.out.println("indice: 0123456789");
        System.out.println("regex "+regex);
        System.out.println("Posicoes encontradas");

        while(matcher.find()) {
            System.out.println(matcher.start()+" "+matcher.group());
        }
    }
}
