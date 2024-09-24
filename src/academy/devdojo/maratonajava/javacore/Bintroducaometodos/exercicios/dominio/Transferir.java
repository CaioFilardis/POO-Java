package academy.devdojo.maratonajava.javacore.Bintroducaometodos.exercicios.dominio;

public class Transferir {

    public void tranferir(ContaA origem, ContaA destino) {
        if (origem.numero == destino.numero) {
            System.out.println("Conta destino inválida");
            return;
        }
        System.out.println("Nome do titutlar: "+origem.titular);
        System.out.println("Numero da conta: "+origem.numero);
        System.out.printf("Saldo da conta: \n%.2f", origem.saldo);

        System.out.println("\n=====================");

        double valorTransferencia = 50.05;
        System.out.println("Valor a trasnferir: "+valorTransferencia);
        origem.saldo -= valorTransferencia;

        System.out.println("=====================");

        System.out.println("Nome titular: "+destino.titular);
        System.out.println("Numero conta: "+destino.numero);
        destino.saldo += valorTransferencia;
        System.out.printf("Valor do saldo: \n%.2f", destino.saldo);
    }
}
