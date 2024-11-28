package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {

    public static void main(String[] args) {
        String mascara = "yyy.MM.dd G 'at' HH:mm:ss z";
        String mascara2 = "'Amsterdam' dd 'de' MMMM 'de' yyyy ";
        // Classe que serve para trabalharmos com formatação de Datas
        SimpleDateFormat sdf = new SimpleDateFormat(mascara);
        SimpleDateFormat sdf2 = new SimpleDateFormat(mascara2);
        System.out.println(sdf.format(new Date()));
    }
}
