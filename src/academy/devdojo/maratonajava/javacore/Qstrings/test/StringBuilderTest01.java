package academy.devdojo.maratonajava.javacore.Qstrings.test;

public class StringBuilderTest01 {

    public static void main(String[] args) {
        String nome = "Caio Santos";
        nome.concat(" Filardis");
        nome.substring(0, 3);
        System.out.println(nome);
        
        StringBuilder sb = new StringBuilder("Caio Filardis"); // capacidade padrão de 16 caracteres
        sb.append(" Filardis").append(" Barbosa");
        sb.reverse();
        sb.reverse();
        sb.delete(0,3);
        System.out.println(sb);
    }
}
