package academy.devdojo.maratonajava.javacore.Vio.exercice.testfile;

import java.io.File;

public class ThesIsDirectory {

    public static void main(String[] args) {
        File file = new File("C:\\temp\\ws-intellij-IDEA\\cursoDevDojo\\meuArquivo.txt");
        boolean isDirectory = file.isDirectory();
        System.out.println(isDirectory);
    }
}
