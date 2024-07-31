package academy.devdojo.maratonajava.javacore.Bintroducaoclasses.exercicios.dominio;

public class ContaBancaria {

    int numeroConta;
    double saldo;

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getNumeroConta() {
        if (numeroConta <= 0) {
            System.out.println("Numero de conta inválido");
            return 0;
        }
        return numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        if (saldo <= 0) {
            System.out.println("Saldo indisponível");
            return 0;
        }
        return saldo;
    }
}
