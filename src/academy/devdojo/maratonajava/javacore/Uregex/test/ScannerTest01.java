package academy.devdojo.maratonajava.javacore.Uregex.test;

public class ScannerTest01 {

    public static void main(String[] args) {
        String texto = "Levi, Ere, Mikasa, true, 200";
        String[] nomes = texto.split(","); // delimita por vírgula
        for (String listaNomes:nomes) {
            System.out.println(listaNomes.trim());
        }
    }
}
