package academy.devdojo.maratonajava.javacore.Csobrecargametodos.exerciciosobrecarga.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.exerciciosobrecarga.dominio.Livro;

public class LivroTest01 {

    public static void main(String[] args) {
        Livro livro = new Livro();

        livro.setTitulo("O último olimpiano");
        livro.setAutor("Rick Jordan");
        livro.setNumeroPaginas(355);

        livro.imprimir();
        System.out.println("========= Depois =========");
        livro.imprimir(true);
    }
}
