package academy.devdojo.maratonajava.javacore.Rdatas.exercise;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest02 {

    public static void main(String[] args) {
        Locale localeEstadosUnidos = new Locale("en", "US");
        Locale localeBrasil = new Locale("pt", "BR");

        Calendar calendar = Calendar.getInstance();
        DateFormat date1 = DateFormat.getDateInstance(DateFormat.SHORT, localeBrasil);
        DateFormat date2 = DateFormat.getDateTimeInstance();

        System.out.println("Data no Brasil: "+date1.format(calendar.getTime()));
        System.out.println("Data no EUA: "+date2.format(calendar.getTime()));
    }
}
