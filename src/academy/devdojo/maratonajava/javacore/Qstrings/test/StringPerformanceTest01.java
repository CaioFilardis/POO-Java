package academy.devdojo.maratonajava.javacore.Qstrings.test;

public class StringPerformanceTest01 {

    public static void main(String[] args) {
        Long inicio = System.currentTimeMillis(); // tempo para iniciar em milisegundos
        concatString(30000);
        Long fim = System.currentTimeMillis(); // tempo ate finalizar milisegundos
        System.out.println("Tempo gasto apra String " + (fim - inicio) + "ms");


        inicio = System.currentTimeMillis(); // tempo para iniciar em milisegundos
        concatStringBuilder(1_000_000);
        fim = System.currentTimeMillis(); // tempo ate finalizar milisegundos
        System.out.println("Tempo gasto apra StringBuilder " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis(); // tempo para iniciar em milisegundos
        concatStringBuffer(1_000_000);
        fim = System.currentTimeMillis(); // tempo ate finalizar milisegundos
        System.out.println("Tempo gasto apra StringBuffer " + (fim - inicio) + "ms");
    }


    private static void concatString(Integer tamanho) {
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }
    }

    private static void concatStringBuilder(Integer tamanho) {
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i) ; // realiza contagem 0,01.. 0,02, 0
        }
    }

    private static void concatStringBuffer(Integer tamanho) {
        StringBuffer sb = new StringBuffer( tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i) ; // realiza contagem 0,01.. 0,02, 0...
        }
    }
}
