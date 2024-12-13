package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {

    public static void main(String[] args) {
         // \\d = Todos os dígitos
        // \\D = Tudo o que não for dígito
        // \\s = Espaços em brnaco: \t \n \f \r
        // \\S = Todos os caracteres, excluindo os brancos
        // \\w = Tudo que for de a-z, dígitos e '_'
        // \\W = Tudo que não for a-z, díigots e '_'
        // [] = Seleção
        /* Quantificadores:
            ? Zero ou uma ocorrencias
            * Zero ou mais ocorrencias (caracteres)
            + uma ou mais
            {n,m} de n até m
            () agrupamento
            | ou
            $ fim da linha
         */
        String regex = "([a-zA-Z0-9\\.])+@([a-zA-Z\\.])+(\\.([a-zA-Z])+)+";
        String texto = "caio.filardis@hotmail.com, caiosantosshake@hotmail.com, santosshake@gmail.com, produtosacademy.com.br";
        System.out.println("Email válido");
        System.out.println("#@!naruto@mail.com".matches(regex));
        System.out.println(Arrays.toString(texto.split(",")));
        System.out.println(texto.split(",")[1].trim()); // remove espaços

        // Classe Pattern
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        while(matcher.find()) {
            System.out.println(matcher.start()+" "+matcher.group());
        }
    }
}
