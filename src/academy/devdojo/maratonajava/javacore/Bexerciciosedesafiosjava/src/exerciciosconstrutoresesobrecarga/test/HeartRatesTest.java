package exerciciosconstrutoresesobrecarga.test;

import exerciciosconstrutoresesobrecarga.dominio.HeartRates;

import java.util.Scanner;

public class HeartRatesTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("-------- Informe suas informações -------");
        System.out.print("Nome: ");
        String name = input.nextLine();
        System.out.print("Sobrenome: ");
        String surname = input.nextLine();
        System.out.print("Dia do nascimento: ");
        int day = input.nextInt();
        System.out.print("Mês do nascimento: ");
        int month = input.nextInt();
        System.out.print("Ano do nascimento: ");
        int year = input.nextInt();

        HeartRates heart = new HeartRates(name, surname, day, month, year);

        System.out.printf("Nome: %s%n", heart.getName());
        System.out.printf("Surname: %s%n", heart.getName());
        System.out.printf("Data de nascimento: %d/ %d/ %d", heart.getDay(), heart.getMonth(), heart.getYear());

        System.out.println("---------------------------");

        System.out.println("Idade da pessoa: "+heart.idade(heart.getYear()));
        System.out.println("Frequencia cardiaca máxima calculada: "+heart.maxHeartRate(heart.getYear()));
    }
}
