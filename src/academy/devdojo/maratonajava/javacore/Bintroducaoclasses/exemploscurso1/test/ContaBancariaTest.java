package academy.devdojo.maratonajava.javacore.Bintroducaoclasses.exercicios.test;

import academy.devdojo.maratonajava.javacore.Bintroducaoclasses.exercicios.dominio.ContaBancaria;

import java.util.Scanner;

public class ContaBancariaTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();
        double deposito;
        double saque;

        System.out.print("Diigte o numero da conta: ");
        conta.setNumeroConta(input.nextInt());

        switch (conta.getNumeroConta()) {
            case 1 -> {
                deposito = input.nextDouble();
                conta.setSaldo(deposito);
                saque = input.nextDouble();

                if (saque > conta.getSaldo()) {
                    System.out.println("Saldo insuficiente");
                }
                else {
                    conta.setSaldo(deposito - saque);
                    System.out.println("A sacar = "+conta.getSaldo());
                }
            }
            case 2 -> {
                deposito = input.nextDouble();
                conta.setSaldo(deposito);
                System.out.println("Saldo disponível = "+conta.getSaldo());
            }
        }

    }
}
