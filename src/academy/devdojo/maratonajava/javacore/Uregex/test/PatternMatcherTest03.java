package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {

    public static void main(String[] args) {
         // \\d = Todos os dígitos
        // \\D = Tudo o que não for dígito
        // \\s = Espaços em brnaco: \t \n \f \r
        // \\S = Todos os caracteres, excluindo os brancos
        // \\w = Tudo que for de a-z, dígitos e '_'
        // \\W = Tudo que não for a-z, díigots e '_'
        // [] =
        /* Quantificadores:
            ? Zero ou uma ocorrencias
            * Zero ou mais ocorrencias (caracteres)
            + uma ou mais
            {n,m} de n até m
            () agrupamento
            | ou
            $ fim da linha
         */
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String regex2 = "0[xX][1-8a-fA-F]";
        //String texto = "abaaba";
        String texto2 = "12 0x 0x 0xFFABC 0x10G 0x1";

        // Classe Pattern
        Pattern pattern = Pattern.compile(regex);
        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher = pattern.matcher(texto2);
        Matcher matcher2 = pattern2.matcher(texto2);
        System.out.println("texto:  "+texto2);
        System.out.println("indice: 0123456789");
        System.out.println("regex "+regex);
        System.out.println("Posicoes encontradas");

        while(matcher.find()) {
            System.out.println(matcher.start()+" "+matcher.group());
        }

        while (matcher2.find()) {
            System.out.println(matcher2.start()+" "+matcher2.group());
        }
    }
}
