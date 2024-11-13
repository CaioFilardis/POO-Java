package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioArquivo;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioMemoria;

import java.util.AbstractList;
import java.util.LinkedList;
import java.util.List;

public class RepositorioTest {

    public static void main(String[] args) {
        RepositorioBancoDeDados repositorioBancoDeDados = new RepositorioBancoDeDados();
        repositorioBancoDeDados.salvar();

        Repositorio repositorioArquivo = new RepositorioArquivo();
        Repositorio repositorioDB = new RepositorioBancoDeDados();
        Repositorio repositorioMemoria = new RepositorioMemoria();

        repositorioArquivo.salvar();
        repositorioDB.salvar();
        repositorioMemoria.salvar();

        List<String> list = new LinkedList<>();
        list.add("Goku");
        list.add("Gohan");
        list.add("Vegeta");
        System.out.println(list);
    }
}
