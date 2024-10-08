package academy.devdojo.maratonajava.javacore.Gassocaicao.test;

import academy.devdojo.maratonajava.javacore.Gassocaicao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassocaicao.dominio.Professor;

public class EscolaTest01 {

    public static void main(String[] args) {
        Professor professor1 = new Professor("Jiraya");
        Professor professor2 = new Professor("Kakashi");
        Professor[] professores = {professor1,professor2};

        Escola escola = new Escola("Konoha", professores);

        /*  Sem construtor sobrecarregado
        Escola escola = new Escola("Konoha");
        escola.setProfessores(professores); */
        escola.imprime();
    }
}
