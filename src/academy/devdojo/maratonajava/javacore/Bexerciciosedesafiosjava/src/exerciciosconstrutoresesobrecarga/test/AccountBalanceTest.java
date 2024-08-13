package exerciciosconstrutoresesobrecarga.test;

import exerciciosconstrutoresesobrecarga.dominio.Account;
import exerciciosconstrutoresesobrecarga.dominio.AccountBalance;

public class AccountBalanceTest {

    public static void main(String[] args) {
        AccountBalance accountBalance01 = new AccountBalance("Caio", 1500.50);
        AccountBalance accountBalance02 = new AccountBalance("Milena", -5.6);

        System.out.printf("%s balance: $ %.2f%n", accountBalance01.getName(), accountBalance01.getBalance());
        System.out.printf("%s balance: $ %.2f%n", accountBalance02.getName(), accountBalance02.getBalance());

        System.out.println();
        accountBalance01.deposit(500.50);
        accountBalance02.deposit(0.0);

        System.out.println("Depósito realizado");
        System.out.printf("%s new balance: $ %.2f%n", accountBalance01.getName(), accountBalance01.getBalance());
        System.out.printf("%s new balance: $ %.2f%n", accountBalance02.getName(), accountBalance02.getBalance());
    }
}
