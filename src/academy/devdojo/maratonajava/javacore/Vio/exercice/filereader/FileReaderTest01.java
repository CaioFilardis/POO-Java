package academy.devdojo.maratonajava.javacore.Vio.exercice.filereader;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderTest01 {

    public static void main(String[] args) {
        //criarArquivo();
        escreverArquivo();
        lerArquivo();
    }

    static void criarArquivo() {
        File file = new File("texto.txt");
        try {
            file.createNewFile();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    static void escreverArquivo() {
        File file = new File("arquivo.txt");
        try (FileWriter fileWriter = new FileWriter(file, true)) {
            fileWriter.write("Olá, Mundo");
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    static void lerArquivo() {
        Scanner sc = new Scanner(System.in);
        File file = new File("arquivo.txt");
        try (FileReader fileReader = new FileReader(file)) {
            System.out.println("Escolha entre\n1- Uso de array\n2 - Interar\n");
            int escolhar = sc.nextInt();
            switch (escolhar) {
                case 1 -> {
                    char[] iterar = new char[5];
                    fileReader.read(iterar);
                    for (char listar:iterar) {
                        System.out.println(listar);
                    }
                    break;
                }
                case 2 -> {
                    int i;
                    while((i = fileReader.read()) != -1) {
                        System.out.println((char)i);
                    }
                }
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
