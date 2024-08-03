package introducaopoo.constrtutores.test;

import introducaopoo.constrtutores.dominio.Formatacao;

public class FormatarTest {

    public static void main(String[] args) {
        Formatacao formatando = new Formatacao();
        formatando.formatar("Caio", 5, ' ');
        formatando.imprime();
    }
}
