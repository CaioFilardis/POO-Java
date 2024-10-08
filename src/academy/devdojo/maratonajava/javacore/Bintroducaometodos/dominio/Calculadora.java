package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void somarDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtrairDoisNumeros() {
        System.out.println(32 - 11);
    }

    public void multiplicaDoisNumeros(int num1, float num2) {
        System.out.println(num1 * num2);
    }

    public double dividirDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public double dividirDoisNumeros02(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public void imprimirDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Divisão impossível");
            return;
        }
        System.out.println(num1 / num2);
    }

    public void alteraDoisNumeros(int num1 , int num2) {
        System.out.println("Dentro do altera dois numeros");
        System.out.println("Num1: "+num1);
        System.out.println("Num2: "+num2);
        num1 = 99;
        num2 = 33;
        System.out.println("Num1: "+num1);
        System.out.println("Num2: "+num2);
    }

    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int num:numeros) {
            soma += num;
        }
        System.out.println("Soma = "+soma );
    }

    public void somaVarArgs(int... numeros) {
        int soma = 0;
        for (int num:numeros) {
            soma += num;
        }
        System.out.println("Soma = "+soma );
    }
}
