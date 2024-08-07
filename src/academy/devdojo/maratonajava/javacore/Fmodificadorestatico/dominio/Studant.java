package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Studant {
    private static String cpf;

    public static void setCpf(String cpf) {
        Studant.cpf = cpf;
    }

    public static String getCpf() {
        return cpf;
    }
}
