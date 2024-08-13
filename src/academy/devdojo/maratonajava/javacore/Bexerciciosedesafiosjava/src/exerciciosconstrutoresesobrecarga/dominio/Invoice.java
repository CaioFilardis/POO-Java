package exerciciosconstrutoresesobrecarga.dominio;

public class Invoice {

    private String numero;
    private String descricao;
    private int quantidadeCompra;
    private double precoItem;

    public Invoice(String numero, String descricao) {
        this.numero = numero;
        this.descricao = descricao;
    }

    public Invoice(String numero, String descricao, int quantidadeCompra, double precoItem) {
        this(numero, descricao);
        this.quantidadeCompra = quantidadeCompra;
        this.precoItem = precoItem;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setQuantidadeCompra(int quantidadeCompra) {
        this.quantidadeCompra = quantidadeCompra;
    }

    public int getQuantidadeCompra() {
        if (quantidadeCompra < 0) {
            return 0;
        }
        return quantidadeCompra;
    }

    public void setPrecoItem(double precoItem) {
        this.precoItem = precoItem;
    }

    public double getPrecoItem() {
       if (precoItem < 0) {
           return 0.0;
       }
        return precoItem;
    }

    public double getInvoiceAmount() {
        return getQuantidadeCompra() * getPrecoItem();
    }
}
