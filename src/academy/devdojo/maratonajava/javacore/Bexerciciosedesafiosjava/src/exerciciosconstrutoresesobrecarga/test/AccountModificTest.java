package exerciciosconstrutoresesobrecarga.test;

import exerciciosconstrutoresesobrecarga.dominio.AccountModific;

public class AccountModificTest {

    public static void main(String[] args) {
        AccountModific account = new AccountModific("Caio", 1500.00);

        System.out.println("---------- Current balance ----------");
        System.out.printf("%s balance: $ %.2f%n", account.getName(), account.getBalance());

        account.deposit(500.00);

        System.out.println("---------- New Balance ----------");
        System.out.printf("New apport: $ %.2f%n", account.getBalance());

        account.withdraw(1371.91);
        System.out.println("---------- Withdrawal ----------");
        System.out.printf("To withdraw: %.2f", account.getBalance());


    }
}
