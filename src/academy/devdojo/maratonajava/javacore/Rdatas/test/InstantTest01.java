package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest01 {

    public static void main(String[] args) {
        // Classe que trabalha com Milissegundos
        Instant now = Instant.now();
        System.out.println(now); // zuluTime: 2024-11-29T00:18:56.558438900Z
        System.out.println(LocalDateTime.now()); // 2024-11-28T21:18:56.628395500
        System.out.println(now.getEpochSecond());
        System.out.println(now.getNano()); // 999.999.999 - 1 bilhao de nanossegundos
        System.out.println(Instant.ofEpochSecond(3));
        System.out.println(Instant.ofEpochSecond(3, 0));
        System.out.println(Instant.ofEpochSecond(3, 1_000_000_000));
        System.out.println(Instant.ofEpochSecond(3, -1_000_000_000));
    }
}
