package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {

    public static void main(String[] args) throws IOException {
        File fileDiretorio = new File("folder");
        boolean isDiretorioCriado = fileDiretorio.mkdir(); // metodo que cria diretórios
        System.out.println("Pasta criada? "+isDiretorioCriado);

        // passando caminho absoluto + criação do arquivo
        File fileArquivoDiretorio = new File(fileDiretorio, "arquivo.txt");
        boolean isFileCreatead = fileArquivoDiretorio.createNewFile();
        System.out.println("arquivo.txt criado? "+isFileCreatead);

        // renomear arquivo
        File fileReanamed = new File(fileDiretorio, "arquivo_renomeado.txt");
        boolean isRenamed = fileArquivoDiretorio.renameTo(fileReanamed);
        System.out.println("arquivo.txt renomeado? "+isRenamed);

        // renomear diretório
        File diretoryRenamed = new File("pasta2");
        boolean isDirectoryRenamed = fileDiretorio.renameTo(diretoryRenamed);
        System.out.println("Diretorio pasta renomeado? "+isDirectoryRenamed);
    }
}
