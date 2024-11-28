package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Pedido;

public class PedidoTest01 {

    public static void main(String[] args) {
        Pedido meuPedido = new Pedido();

        meuPedido.setCodigo(Integer.parseInt("111"));
        meuPedido.setDesconto(0.05);
        meuPedido.setSubTotal(15.98);

        System.out.printf("%.2f", meuPedido.getTotal());
    }
}
