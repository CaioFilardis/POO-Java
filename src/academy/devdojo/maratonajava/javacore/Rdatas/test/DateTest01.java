package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.util.Date;

public class DateTest01 {

    public static void main(String[] args) {
        Date date = new Date(1732395270182L); // long 1000000
        date.setTime(date.getTime() + 3_600_00);
        System.out.println(date);
    }
}
