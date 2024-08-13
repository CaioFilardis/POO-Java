package exerciciosconstrutoresesobrecarga.dominio;

public class AccountModific {
    private String name;
    private double balance;

    public AccountModific(String name, double balance) {
        this.name = name;

        if (balance > 0.0) {
            this.balance = balance;
        }
    }

    public void deposit(double depositAmount) {
        System.out.printf("New value apport: %.2f%n", depositAmount);
        if (depositAmount > 0.0) {
            balance += depositAmount;
        }
    }

    public void withdraw(double depositWithdrawal) {
        if (depositWithdrawal > balance) {
            System.out.println("Withdrawal amount exceeded account balance");
        }
        else {
            balance -= depositWithdrawal;
        }
    }

    public double getBalance() {
        return balance;
    }






    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
