package academy.devdojo.maratonajava.javacore.Rdatas.exercise;

import java.util.Date;

public class DateExercise01 {

    public static void main(String[] args) {
        Date date1 = new Date();
        Date date2 = new Date(173239527050L);
        Date date3 = new Date(date1.getTime() - date2.getTime());
        System.out.println(date3);
        System.out.println(date3.compareTo(date1));;
    }
}
