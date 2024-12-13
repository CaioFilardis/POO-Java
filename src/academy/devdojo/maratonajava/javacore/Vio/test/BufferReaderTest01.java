package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.*;

public class BufferReaderTest01 {

    public static void main(String[] args) {
        File file = new File("meuArquivo.txt");
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            bufferedReader.readLine(); // retorna nulo
            String linha;
            while ((linha= bufferedReader.readLine()) != null) {
                System.out.println(linha);
            }

        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
