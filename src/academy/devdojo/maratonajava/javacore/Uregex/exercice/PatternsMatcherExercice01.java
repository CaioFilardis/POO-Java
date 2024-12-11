package academy.devdojo.maratonajava.javacore.Uregex.exercice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternsMatcherExercice01 {

    public static void main(String[] args) {
        String texto = "aca";
        String url = "sfdsfsdf54s5f45sf";

        Pattern pattern = Pattern.compile(texto);
        Matcher matcher = pattern.matcher(url);
        System.out.println("Texto: "+texto);
        System.out.println("URL: "+url);

        while (matcher.find()) {
            System.out.println(matcher.start()+" "+matcher.group());
        }
    }
}
