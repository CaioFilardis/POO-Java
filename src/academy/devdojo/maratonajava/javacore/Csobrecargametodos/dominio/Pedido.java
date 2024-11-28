package academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio;

public class Pedido {

    private Integer codigo;
    private Double subTotal;
    private Double desconto;
    //private Double total;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Double subTotal) {
        this.subTotal = subTotal;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public Double getTotal() {
        return getSubTotal() - getDesconto();
    }
}
