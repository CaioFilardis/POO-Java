package academy.devdojo.maratonajava.javacore.Rdatas;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTes01 {

    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());
        System.out.println(Month.JANUARY.getValue());
        // API LocalDate
        LocalDate date = LocalDate.of(2024, Month.JANUARY, 27); // 2024/11/16
        LocalDate agora = LocalDate.now(); // instancia de localDate
        agora.plusWeeks(4);

        System.out.println(date.getYear()); // ano atual
        System.out.println(date.getMonth()); // mês
        System.out.println(date.getMonthValue()); // valor mês
        System.out.println(date.getDayOfMonth()); // Dia do mês
        System.out.println(date.getDayOfWeek()); // Dia do semana
        System.out.println(date.lengthOfMonth()); // Dia do ano
        System.out.println(date.isLeapYear()); // Verificar se o ano é bissexto
        System.out.println(date.get(ChronoField.YEAR)); // ano
        System.out.println(date.get(ChronoField.DAY_OF_MONTH)); // dia
        System.out.println(date);
        System.out.println(agora); // a data atual
        System.out.println(LocalDate.MAX); // Data máxima
        System.out.println(LocalDate.MIN); // Data mínima
    }
}
