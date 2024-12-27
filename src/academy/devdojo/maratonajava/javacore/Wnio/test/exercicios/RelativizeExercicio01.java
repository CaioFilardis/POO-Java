package academy.devdojo.maratonajava.javacore.Wnio.test.exercicios;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeExercicio01 {

    public static void main(String[] args) {
        Path absoluto01 = Paths.get("/home/user/documents");
        Path absoluto02 = Paths.get("/home/user/download");

        System.out.println("1 "+absoluto01.relativize(absoluto02));

        Path diretorio = Paths.get("/home/user/documents");
        Path subdiretorio = Paths.get("/home/user/documents/reports");
        Path teste = diretorio.relativize(subdiretorio);
        System.out.println("2 "+Files.isDirectory(teste));
    }
}
