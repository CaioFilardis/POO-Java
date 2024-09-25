package academy.devdojo.maratonajava.javacore.Bintroducaometodos.Zexercicios.Aparametrosreferencia.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.Zexercicios.Aparametrosreferencia.dominio.ContaA;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.Zexercicios.Aparametrosreferencia.dominio.Transferir;

public class ContaATest01 {

    public static void main(String[] args) {
        ContaA contaOrigem = new ContaA();
        ContaA contaDestino = new ContaA();

        contaOrigem.numero = 1568;
        contaOrigem.titular = "Caio";
        contaOrigem.saldo = 97.67;

        contaDestino.numero = 1568;
        contaDestino.titular = "Guto";
        contaDestino.saldo = 0.0;

        Transferir transferir = new Transferir();
        transferir.tranferir(contaOrigem, contaDestino);

        System.out.printf("\nSaldo atual da conta origem: R$ %.2f", contaOrigem.saldo);
    }
}
