package exerciciosconstrutoresesobrecarga.dominio;

import java.time.chrono.HijrahEra;

public class HeartRates {
    private String name;
    private String surname;
    private int day;
    private int month;
    private int year;

    public HeartRates(String name, String surname, int day, int month, int year) {
        this.name = name;
        this.surname = surname;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setDay(int day) {
        this.day = day;
    }


    public int getDay() {
        return day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }


    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    int ageYear;
    public int idade(int year) {
        ageYear = 2024 - year;
        return ageYear;
    }

    int heartMaxRate;
    public int maxHeartRate(int ageYear) {
        return 220 - ageYear;
    }
}
