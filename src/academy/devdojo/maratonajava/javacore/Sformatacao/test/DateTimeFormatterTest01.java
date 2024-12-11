package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {

    public static void main(String[] args) {
        // Classe que trabalha com formatação
        // FORMATT: Transforma objeto para uma String
        // PARSE: Transforma uma string para um objeto

        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE); // formata dia, mês e ano sem espaço
        String s2 = date.format(DateTimeFormatter.ISO_DATE); // ano, mês e dia + offset
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE); // formatação padrão
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        LocalDate parse1 = LocalDate.parse("20241205", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2024-12-05+05:00", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2024-12-05", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);

        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s4);
        LocalDateTime parse4 = LocalDateTime.parse("2024-12-05T20:14:44.4441193");
        System.out.println(parse4);

        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy ");
        String formatBR = LocalDate.now().format(formatterBR);
        System.out.println(formatBR);
        /*LocalDate parseBR = LocalDate.parse("16/02/2024", formatterBR);
        System.out.println(parseBR);*/

        /*DateTimeFormatter formatterGR = DateTimeFormatter.ofPattern("dd.MM.yyyy", Locale.GERMAN);
        String formatGR = LocalDate.now().format(formatterGR);
        LocalDate parseGR = LocalDate.parse("16.December.2024", formatterGR);
        System.out.println(parseGR);*/


    }
}
