package academy.devdojo.maratonajava.javacore.exercíciosbasicos.estruturarepeticao.rewhile;
import java.util.Scanner;

public class ParesConsecutivos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int soma = 0, contador = 0;
		
		System.out.print("Digite um numero inteiro: ");
		int numero = sc.nextInt();
		
		if (numero > 0) {
			while (contador < 5) {
				if (numero % 2 == 0){
					soma = soma + numero;
					contador++;
				}
				numero++;
			}
			System.out.printf("SOMA = %d", soma);
		}
	}
}