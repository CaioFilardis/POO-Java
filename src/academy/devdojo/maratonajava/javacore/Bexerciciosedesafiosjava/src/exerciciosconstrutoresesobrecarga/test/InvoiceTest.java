package exerciciosconstrutoresesobrecarga.test;

import exerciciosconstrutoresesobrecarga.dominio.Invoice;

public class InvoiceTest {

    public static void main(String[] args) {
        Invoice invoice = new Invoice("1", "Copo", 5, 5.5);

        System.out.printf("Numero do item: %s%n", invoice.getNumero());
        System.out.printf("Descrição do item: %s%n", invoice.getDescricao());
        System.out.printf("Quantidade de item comprados: %d%n", invoice.getQuantidadeCompra());
        System.out.printf("Preco do item: %.2f%n", invoice.getPrecoItem());

        System.out.println("--------------------------");
        System.out.printf("Valor total do item: %.2f%n", invoice.getInvoiceAmount());
    }
}
