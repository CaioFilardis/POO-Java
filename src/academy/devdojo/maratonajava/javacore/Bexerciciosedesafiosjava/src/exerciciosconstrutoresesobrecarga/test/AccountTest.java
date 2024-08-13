package exerciciosconstrutoresesobrecarga.test;

import exerciciosconstrutoresesobrecarga.dominio.Account;

public class AccountTest {
    public static void main(String[] args) {

        Account myAccount01 = new Account("Jane Green");
        Account myAccount02 = new Account("John Blue");

        /*
        myAccount01.imprime();
        myAccount02.imprime(); */

        System.out.printf("account1 name is: %s%n",myAccount01.getName());
        System.out.printf("account2 name is: %s%n",myAccount02.getName());
    }
}

