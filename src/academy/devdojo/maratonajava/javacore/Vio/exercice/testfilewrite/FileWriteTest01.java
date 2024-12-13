package academy.devdojo.maratonajava.javacore.Vio.exercice.testfilewrite;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteTest01 {

    public static void main(String[] args) {
        File file = new File("meuArquivo.txt");

        try (FileWriter fileWriter = new FileWriter(file, true)) {
            Boolean fileCreated = file.canWrite();
            if (fileCreated) {
                System.out.println("Arquivo criado");
            }
            fileWriter.write("Escrevendo em uma nova classe\nSeja bem vindo ao Java!");

        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
