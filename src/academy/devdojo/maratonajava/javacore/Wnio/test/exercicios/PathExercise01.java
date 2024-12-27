package academy.devdojo.maratonajava.javacore.Wnio.test.exercicios;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExercise01 {

    public static void main(String[] args) {
        Path absoluto = Paths.get("/home/user/documents"); // possui '/' no inicio do caminho
        Path realtivo = Paths.get("reports.txt");

        System.out.println("Pt.01\n"+absoluto.resolve(realtivo));

        Path subdiretorioAbsoluto = Paths.get("/home/user");
        Path fileRelative = Paths.get("documents/report.pdf");
        Path juncao = subdiretorioAbsoluto.resolve(fileRelative);
        System.out.println("Pt.02\n"+juncao);

        Path caminhoabosluto = Paths.get("/home/user/downloads");
        System.out.println("Pt.03\n"+absoluto.resolve(caminhoabosluto));
        System.out.println("Pt.03\n"+caminhoabosluto.resolve(absoluto));
    }
}
