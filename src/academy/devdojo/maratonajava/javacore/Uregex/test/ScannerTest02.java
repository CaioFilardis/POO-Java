package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.Scanner;

public class ScannerTest02 {

    public static void main(String[] args) {
        String nomes = "Levi,Eren,Misaka,true,200";
        Scanner input = new Scanner(nomes);
        // usando vírgula como delimitador
        input.useDelimiter(",");
        while (input.hasNext()) {

            if (input.hasNextInt()) {
                int i = input.nextInt();
                System.out.println("Int "+i);
            } else if (input.hasNextBoolean()){
                boolean b = input.nextBoolean();
                System.out.println("Boolean "+b);
            } else {
                System.out.println(input.next());
            }
        }
    }
}
