package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest01 {

    public static void main(String[] args) {
        // Classe Map, retorna todas as zonas que a API do Java abrange
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault()); // retorna a zona do sistema
        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo"); // retorna uma zona específica
        System.out.println(tokyoZone);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now); // não oferece nenhum tipo de zona

        // para mudar isso
        ZonedDateTime zonedDateTime1 = now.atZone(tokyoZone); // traz o horário + a zona
        System.out.println(zonedDateTime1);

        Instant nowInstant = Instant.now();
        System.out.println(nowInstant); // retorna a fuso zulutime (horário formatado)
        ZonedDateTime zonedDateTime2 = nowInstant.atZone(tokyoZone);
        System.out.println(zonedDateTime2);

        // Classe que trabalha com zonas + horários (valores mínimos e máximos)
        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);

        ZoneOffset offsetManaus = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime1 = now.atOffset(offsetManaus);
        System.out.println(offsetDateTime1); // sem a zona

        OffsetDateTime offsetDateTime2 = OffsetDateTime.of(now, offsetManaus);
        System.out.println(offsetDateTime2);

        OffsetDateTime offsetDateTime3 = nowInstant.atOffset(offsetManaus);
        System.out.println(offsetDateTime3);

        // Trabalhar com calendários específicos
        JapaneseDate japaneseDate = JapaneseDate.now();
        System.out.println(japaneseDate);

        LocalDate meijiEraLocalDate = LocalDate.of(1900, 2, 1);
        JapaneseDate meijEra = JapaneseDate.from(meijiEraLocalDate);
        System.out.println(meijEra);
    }
}
