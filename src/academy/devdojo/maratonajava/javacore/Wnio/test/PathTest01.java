package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {

    public static void main(String[] args) {
        Path path1 = Paths.get("C:\\temp\\ws-intellij-IDEA\\cursoDevDojo\\meuArquivo.txt");
        Path path2 = Paths.get("C:\\temp\\ws-intellij-IDEA\\cursoDevDojo", "meuArquivo.txt");
        Path path3 = Paths.get("C","\\temp\\ws-intellij-IDEA\\cursoDevDojo\\meuArquivo.txt");
        Path path4 = Paths.get("C","temp", "ws-intellij-IDEA", "cursoDevDojo", "meuArquivo.txt");
        
        System.out.println(path1.getFileName());
        System.out.println(path1.getFileName().toFile());
    }
}
