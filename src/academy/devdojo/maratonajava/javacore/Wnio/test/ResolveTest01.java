package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveTest01 {

    public static void main(String[] args) {
        // metodo resolve, realiza a junção de caminhos na raiz do arquivo
        Path dir = Paths.get("/home/caio"); // caminho relativo
        Path arquivo = Paths.get("dev/arquivo.txt"); // caminho absoluto
        Path resolve = dir.resolve(arquivo); // junta os paths e retorna o caminho
        System.out.println(resolve);
        Path barra = Paths.get("/");
        Path absoluto = Paths.get("/home/caio");
        Path relativo = Paths.get("dev");
        Path file = Paths.get("file.txt");
        System.out.println("1 "+absoluto.resolve(relativo));
        System.out.println("2 "+absoluto.resolve(file));
        System.out.println("3 "+relativo.resolve(absoluto));
        System.out.println("4 "+relativo.resolve(file));
        System.out.println("5 "+file.resolve(absoluto));
        System.out.println("6 "+relativo.resolve(relativo));
    }
}
