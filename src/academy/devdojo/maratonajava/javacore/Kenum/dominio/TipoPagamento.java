package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum TipoPagamento {
        DEBITO {
            @Override
            public double calcularDesconto(double valor) {
                return valor * 0.1;
            }
        },
        CREDITO {
            @Override // assegurar que a execução correta do método
            public double calcularDesconto(double valor) {
                return valor * 0.05;
            }
        };


    // Metodo abstrato
    public abstract double calcularDesconto(double valor);
}