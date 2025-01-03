package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {

    public static void main(String[] args) throws IOException {
       // selecionando o diretorio de execução da classe
        Path pastaPath = Paths.get("pastinha");

        // se não existir o diretorio
        if (Files.notExists(pastaPath)) {
            // crie
            Path pastaDirectory = Files.createDirectory(pastaPath);
        }
        // criando subpasta
        Path subPastaPath = Paths.get("pastinha/subpasta/subsubpasta");
        Path subPastaDirectory = Files.createDirectories(subPastaPath);
        Path filePath = Paths.get(subPastaPath.toString(), "file.txt");

        if (Files.notExists(filePath)) {
            Path filePath1 = Files.createFile(filePath);
        }

        Path source = filePath;
        Path target = Paths.get(filePath.getParent().toString(), "file_renamed.txt");
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
    }
}
