package academy.devdojo.maratonajava.javacore.Vio.exercice.testfile;

import java.io.File;
import java.time.Instant;
import java.time.ZoneId;

public class InformationsFile {

    public static void main(String[] args) {
        File informationsFile = new File("meuArquivo.txt");
        System.out.println("Nome do arquivo eh "+informationsFile.getName());
        System.out.println("Caminho absoluto do arquivo eh "+informationsFile.getAbsolutePath());
        System.out.println("Data de modificação "+ Instant.ofEpochMilli(informationsFile.lastModified()).atZone(ZoneId.systemDefault()));
    }
}
