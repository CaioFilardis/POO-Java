package academy.devdojo.maratonajava.javacore.Bintroducaometodos.Zexercicios.Aparametrosreferencia.dominio;

public class Transferir {

    public void tranferir(ContaA origem, ContaA destino) {
        if (origem.numero == destino.numero) {
            System.out.println("Conta destino inválida");
            return;
        }
        System.out.println("Nome do titutlar: "+origem.titular);
        System.out.println("Numero da conta: "+origem.numero);
        System.out.printf("Saldo da conta: R$ %.2f", origem.saldo);

        System.out.println("\n=====================");

        double valorTransferencia = 50.05;
        System.out.println("Valor a trasnferir: R$ "+valorTransferencia);
        origem.saldo -= valorTransferencia;

        System.out.println("=====================");

        System.out.println("Nome titular: "+destino.titular);
        System.out.println("Numero conta: "+destino.numero);
        destino.saldo += valorTransferencia;
        System.out.printf("Valor do saldo: R$ %.2f", destino.saldo);
        System.out.println("\n=====================");
    }
}
