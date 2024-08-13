package IntroducaoPOO.dominio;

public class Calculo {

    public void somarArray(int[] numeros) {
        int soma = 0;

        for (int num: numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
}
