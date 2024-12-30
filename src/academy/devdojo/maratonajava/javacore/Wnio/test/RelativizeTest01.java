package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {

    public static void main(String[] args) {
        Path dir = Paths.get("/home/caio"); // caminho absoluto
        Path clazz = Paths.get("/home/caio/devdojo/OlaMundo.java");
        Path pathToClazz = dir.relativize(clazz);
        System.out.println(pathToClazz);

        Path absoluto01 = Paths.get("/home/caio");
        Path absoluto02 = Paths.get("/home/local");
        Path absoluto03 = Paths.get("/home/caio/devdojo/OlaMundo.java");
        Path relativo01 = Paths.get("temp");
        Path relativo02 = Paths.get("temp/temp.2024");

        System.out.println("1 "+ absoluto01.relativize(absoluto03));
        System.out.println("2 "+ absoluto03.relativize(absoluto01));
        System.out.println("3 "+ absoluto01.relativize(absoluto02));
        System.out.println("4 "+ relativo01.relativize(relativo02));
        System.out.println("5 "+ relativo02.relativize(relativo01));
    }
}