package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class FileTest01 {

    public static void main(String[] args) {
        File file = new File("file.txt"); // Instanciando um objeto como arquivo de texto.
        // Criar um arquivo
        try {
            boolean isCreated = file.createNewFile();
            System.out.println(isCreated);
            System.out.println("path "+file.getPath()); // saber o nome do arquivo
            System.out.println("path absolute "+file.getAbsolutePath()); // caminho absoluto(raiz)
            System.out.println("is directory "+file.isDirectory());
            System.out.println("is file "+file.isFile());
            System.out.println("is hidden"+file.isHidden());
            System.out.println("last modified "+ Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));
        } catch (IOException exception){
            exception.printStackTrace();
        }

        // Verificar se o aruivo existe(boas práticas)
        try {
            boolean isCreated = file.createNewFile();
            System.out.println(isCreated);
            boolean exists = file.exists();
            if (exists) {
                System.out.println("Deleted "+file.delete());
            }
        } catch (IOException exception){
            exception.printStackTrace();
        }

        // Deletar arquivos sem lançar exceção
        try {
            boolean isDeleted = file.delete();
            System.out.println(isDeleted);
        } catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
