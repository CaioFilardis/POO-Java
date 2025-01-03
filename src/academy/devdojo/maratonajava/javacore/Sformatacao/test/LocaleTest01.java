package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {

    public static void main(String[] args) {
        // pt-BR
        Locale localeItaly = new Locale("it", "IT");
        Locale localeCH = new Locale("it", "CH");
        Locale localeIndia = new Locale("h1", "IN");
        Locale localeJapao = new Locale("ja", "JP");
        Locale localeHolanda = new Locale("nl", "NL");

        Calendar calendar = Calendar.getInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeJapao);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localeHolanda);

        System.out.println("Italia "+df1.format(calendar.getTime()));
        System.out.println("Suíça "+df2.format(calendar.getTime()));
        System.out.println("India "+df3.format(calendar.getTime()));
        System.out.println("Japão "+df4.format(calendar.getTime()));
        System.out.println("Holanda "+df5.format(calendar.getTime()));

        // Irá exibir os paises, de acordo com linguagem padrão da máquina
        System.out.println(localeItaly.getDisplayCountry());
        System.out.println(localeCH.getDisplayCountry());

        // Exibe os paises na linguagem inserida no argumento
        System.out.println(localeCH.getDisplayCountry(localeJapao));
        System.out.println(localeCH.getDisplayCountry(localeIndia));
    }
}
