package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterTest01 {

    public static void main(String[] args) {
        File file = new File("arquivo.txt");
        try (FileWriter fileWriter = new FileWriter(file, true); // encadeado
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            bufferedWriter.write("Olá mundo");
            bufferedWriter.newLine();
            bufferedWriter.flush();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
