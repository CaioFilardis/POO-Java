package academy.devdojo.maratonajava.javacore.Uregex.exercice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternsMatcherExercice01 {

    public static void main(String[] args) {
        String texto = "joao@gmail.com, maria_silva123@hotmail.com, emailinvalido@.com";
        String url = "([a-zA-Z0-9\\.])+@([a-zA-Z\\.])+(\\_([a-zA-Z])+)+";
        System.out.println("Email inválido");
        System.out.println("@.com"+texto.matches(url));

        Pattern pattern = Pattern.compile(texto);
        Matcher matcher = pattern.matcher(url);
        System.out.println("Texto: "+texto);
        System.out.println("URL: "+url);

        while (matcher.find()) {
            System.out.println(matcher.start()+" "+matcher.group());
        }
    }
}
