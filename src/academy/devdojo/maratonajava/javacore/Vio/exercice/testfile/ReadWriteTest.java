package academy.devdojo.maratonajava.javacore.Vio.exercice.testfile;

import java.io.File;

public class ReadWriteTest {

    public static void main(String[] args) {
        File file = new File("meuArquivo.txt");
        boolean legivel = file.canExecute();
        boolean gravavel = file.canWrite();

        if (legivel) {
            System.out.println("Arquivo é legível? "+legivel);
            if (gravavel) {
                System.out.println("Arquivo é gravável? "+gravavel);
            }
        } else {
            System.out.println("Não é legivel nem gravavel");
        }

    }
}
