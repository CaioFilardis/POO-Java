package academy.devdojo.maratonajava.javacore.Vio.exercice.testfilewrite;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteTest02 {

    public static void main(String[] args) {
        File file = new File("meuArquivo.txt");
        try (FileWriter fw = new FileWriter(file)) {
            boolean exist = file.exists();
            System.out.println("Arquivo existe? "+exist);
            if (exist) {
                fw.write("Novo conteúdo do arquivo.");
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
