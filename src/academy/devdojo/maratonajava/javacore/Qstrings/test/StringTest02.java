package academy.devdojo.maratonajava.javacore.Qstrings.test;

public class StringTest02 {

    public static void main(String[] args) {
        String nome = "Naruto";
        String numeros = "012345";
        System.out.println(nome.charAt(0)); // retorna exatamento o caracter no index em parênteses
        System.out.println(nome.length()); // metodo que retorna o tamanho exato da String
        System.out.println(nome.replace("Na", "Bo")); // metodo que realiza a troca de caracteres
        System.out.println(nome.toLowerCase()); // metodo que torna a String toda em caracter minuscula
        System.out.println(nome.toUpperCase()) ; // metodo que torna toda a String em caracer maiúscula
        System.out.println(numeros.length());
        System.out.println(numeros.substring(3));
        System.out.println(numeros.substring(2, numeros.length())) ; // retorna a partir de um determinado ponto os caracteres
        System.out.println(nome.trim());
        System.out.println(numeros.trim());
    }
}
