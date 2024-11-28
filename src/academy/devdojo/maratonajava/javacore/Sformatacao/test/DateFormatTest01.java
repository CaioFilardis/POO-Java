package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTest01 {

    public static void main(String[] args) {
        Calendar cad = Calendar.getInstance();
        DateFormat[] df = new DateFormat[7];

        df[0] = DateFormat.getInstance(); //23/11/2024 20:26
        df[1] = DateFormat.getDateInstance(); // 23 de nov. de 2024
        df[2] = DateFormat.getDateTimeInstance(); // 23 de nov. de 2024 20:26:11
        df[3] = DateFormat.getDateInstance(DateFormat.SHORT); // 23/11/2024
        df[4] = DateFormat.getDateInstance(DateFormat.MEDIUM); // 23 de nov. de 2024
        df[5] = DateFormat.getDateInstance(DateFormat.LONG); // 23 de novembro de 2024
        df[6] = DateFormat.getDateInstance(DateFormat.FULL); // sábado, 23 de novembro de 2024

        for (DateFormat dateFormat:df) {
            System.out.println(dateFormat.format(cad.getTime()));
        }

    }
}
