package academy.devdojo.maratonajava.javacore.Vio.exercice.testfile;

import java.io.File;
import java.util.Scanner;

public class DeletedFile {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        File deletedFile = new File("meuArquivo.txt");
        try {
            System.out.println("Verificando existencia de arquivo");
            boolean verificador = deletedFile.exists();
            if (verificador) {
                System.out.println("Arquivo existe? "+verificador);
                System.out.println("Escolha\n1 - Para deletar\n2 - Para seguir");
                Integer contador = input.nextInt();
                switch (contador) {
                    case 1 : {
                        System.out.println("Arquivo deletado? "+deletedFile.delete());
                        break;
                    }
                    case 2: {
                        System.out.println("Arquivo não será deletado");
                        break;
                    }
                    default:
                        System.out.println("Seguir");
                }
            } else {
                System.out.println("Arquivo não existe");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
