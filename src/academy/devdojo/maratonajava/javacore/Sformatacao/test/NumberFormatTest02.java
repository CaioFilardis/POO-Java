package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest02 {

    public static void main(String[] args) {
        Locale localDefault = Locale.getDefault();
        Locale localBR = new Locale("pt", "BR");
        Locale localJP = Locale.JAPAN;
        Locale localIT = Locale.ITALY;
        // Pegar as propriedades da classe NumberFormat
        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getCurrencyInstance();
        nfa[1] = NumberFormat.getCurrencyInstance(localBR);
        nfa[2] = NumberFormat.getCurrencyInstance(localJP);
        nfa[3] = NumberFormat.getCurrencyInstance(localIT);

        Double valor = 100_000_000.2130;
        for (NumberFormat number:nfa) {
            System.out.println(number.getMaximumFractionDigits());
            System.out.println(number.format(valor));
        }

    }
}
