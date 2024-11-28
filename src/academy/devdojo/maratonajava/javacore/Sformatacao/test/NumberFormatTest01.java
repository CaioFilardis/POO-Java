package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest01 {

    public static void main(String[] args) throws ParseException {
        Locale localDefault = Locale.getDefault();
        Locale localBR = new Locale("pt", "BR");
        Locale localJP = Locale.JAPAN;
        Locale localIT = Locale.ITALY;
        // Pegar as propriedades da classe NumberFormat
        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(localBR);
        nfa[2] = NumberFormat.getInstance(localJP);
        nfa[3] = NumberFormat.getInstance(localIT);

        // Definindo a unidade usada no Brasil
        NumberFormat nfa2 = NumberFormat.getInstance(localBR);

        Double valor = 1_000.2130;
        for (NumberFormat number:nfa) {
            number.setMaximumFractionDigits(2);
            System.out.println(number.format(valor));
        }

        String valorString = "1_000.2130";
        nfa[0].parse(valorString);

    }
}
