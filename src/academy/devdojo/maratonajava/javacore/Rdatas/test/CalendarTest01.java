package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {

    public static void main(String[] args) {
        Calendar cad = Calendar.getInstance(); // calendário
        if (cad.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("Domingo");
        }
        System.out.println(cad.get(Calendar.DAY_OF_WEEK));
        System.out.println(cad.get(Calendar.DAY_OF_MONTH));
        System.out.println(cad.get(Calendar.DAY_OF_YEAR));
        System.out.println(cad.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        cad.add(Calendar.DAY_OF_MONTH, 2);
        cad.roll(Calendar.HOUR, 12);
        Date date = cad.getTime();
        System.out.println(date);
    }
}
