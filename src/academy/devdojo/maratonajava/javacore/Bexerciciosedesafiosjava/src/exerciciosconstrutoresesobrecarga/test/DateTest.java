package exerciciosconstrutoresesobrecarga.test;

import exerciciosconstrutoresesobrecarga.dominio.Date;

public class DateTest {

    public static void main(String[] args) {
        Date date = new Date(16, 11, 2000);

        date.displayDate(date.getDay(), date.getMonth(), date.getYear());
    }
}
