package academy.devdojo.maratonajava.javacore.Vio.exercice.testfile;

import java.io.File;
import java.io.IOException;

public class CreatedFile {

    public static void main(String[] args) {
        File newFile = new File("meuArquivo.txt");
        try {
            System.out.println("Criando novo arquivo");
            boolean createdFile = newFile.createNewFile();
            System.out.println(createdFile);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
