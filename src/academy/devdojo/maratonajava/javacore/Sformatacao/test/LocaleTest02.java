package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.util.Locale;

public class LocaleTest02 {

    public static void main(String[] args) {
        // Saber a configuração do sistema operacional
        System.out.println(Locale.getDefault());

        // Saber todas as ISOs suportadas
        String[] isoCountries = Locale.getISOCountries();
        String[] isoLangues = Locale.getISOLanguages();
        for (String coutries:isoCountries) {
            System.out.print(isoLangues+" ");
        }
        System.out.println();
        for(String language: isoLangues) {
            System.out.print(isoLangues+" ");
        }
    }
}
