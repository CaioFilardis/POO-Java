import java.util.Scanner;

/*
	Faça um programa que peça uma nota, entre zero e dez. Mostre uma 
	mensagem caso o valor seja inválido e continue pedindo até que o 
	usuário informe um valor válido.
*/


public class ValidandoNota {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite alguma nota: ");
		float nota = input.nextFloat();
		
		while (nota < 0 || nota > 10) {
			System.out.print("Nota Inválida! Digite novamente: ");
			nota = input.nextFloat();
		}
		
		System.out.print("Valor válido");
	}
}