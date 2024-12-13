package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteTest01 {

    public static void main(String[] args) {
        // FileWrite: escrever no arquivo
        File file = new File("meuArquivo.txt");
        try(FileWriter fw = new FileWriter(file, true)) { // encadeando um arquivo no outro, mais um booleano
            fw.write("Minha primeira escrita!\nMinha segunda escrita\nMinha terceira escrita"); // escrever no arquivo
            fw.flush(); // limpa o buffer(túnel de dados)
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
