package academy.devdojo.maratonajava.javacore.Bintroducaoclasses.exemploscurso1.dominio;

public class Calculadora {

    public void somarDoisNumeros(int a, int b) {
        int soma = a + b;
        System.out.println("SOMA = "+ soma);
    }

    public void diminuirDoisNumeros(int a, int b) {
        int diferenca = a - b;
        System.out.println("SUBTRAÇAO = "+ diferenca);
    }

    public void multipliqueDoisNumeros(int num1, int num2) {
        System.out.println("MULTIPLICACAO = "+ num1 * num2);
    }

    public int dividaDoisNumeros(int num1, int num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public void alteraDoisNumeros(int num1, int num2) {
        num1 = 99; // maior procedência
        num2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num1 "+num1);
        System.out.println("Num2 "+num2);
    }

    public void somarArrays(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    public void varArgs(int... arry) {
        int soma = 0;
        for (int num : arry) {
            soma += num;
        }
        System.out.println(soma);
    }
}
