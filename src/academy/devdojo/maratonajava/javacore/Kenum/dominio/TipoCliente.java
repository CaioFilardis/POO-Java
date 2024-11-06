package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum TipoCliente {

    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Juridica");

    private int valor;
    private String nomeRelatorio;

    TipoCliente(int valor, String nomeRelatorio) {
        this.valor = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    public static TipoCliente buscarCliente(String nomeRelatorio) {
        for (TipoCliente cliente : values()) {
            if (cliente.getNomeRelatorio().equals(nomeRelatorio)) {
                return cliente;
            }

        }
        return null;
    }

    public int getValor() {
        return valor;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}