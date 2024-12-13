package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {

    public static void main(String[] args) {
        File file = new File("meuArquivo.txt");
        try (FileReader fileReader = new FileReader(file)) {
            System.out.println(fileReader.read()); // Irá ler o primeiro caracter
            // Opcao 01 - Buffer
            /* char[] in = new char[1];
            fileReader.read(in);
            for (char c : in) {
                System.out.println(c);
            }*/
            // Opcao 02 - Iteracao
            int i;
            while ((i = fileReader.read()) != -1) {
                System.out.println((char)i);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
