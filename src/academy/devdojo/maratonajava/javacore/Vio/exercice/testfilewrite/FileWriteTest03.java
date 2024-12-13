package academy.devdojo.maratonajava.javacore.Vio.exercice.testfilewrite;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteTest03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        File file = new File("meuArquivo.txt");
        try (FileWriter fw = new FileWriter(file, true)) {
            String[] texto = new String[3];
            for (int i = 0; i < texto.length; i++) {
                fw.write("Lorem ipsum dolor sit amet\n");
                fw.flush();
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
