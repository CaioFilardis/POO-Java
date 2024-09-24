package academy.devdojo.maratonajava.javacore.Bintroducaometodos.exercicios.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.exercicios.dominio.ContaA;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.exercicios.dominio.Transferir;

public class ContaATest01 {

    public static void main(String[] args) {
        ContaA contaOrigem = new ContaA();
        ContaA contaDestino = new ContaA();

        contaOrigem.numero = 1568;
        contaOrigem.titular = "Caio";
        contaOrigem.saldo = 97.67;

        contaDestino.numero = 1567;
        contaDestino.titular = "Guto";
        contaDestino.saldo = 0.0;

        Transferir transferir = new Transferir();
        transferir.tranferir(contaOrigem, contaDestino);

        System.out.printf("Saldo atual da conta origem: %.2f", contaOrigem.saldo);
    }
}
