import java.util.Scanner;

public class ValidacaoDeNota{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int contadorNota = 0;
		
		System.out.print("Digite a primeira nota: ");
		double primeiraNota = sc.nextDouble();
		
		while(primeiraNota < 0 || primeiraNota > 10) {
			System.out.print("Valor inválido! Tente novamente: ");
			primeiraNota = sc.nextDouble();
		}
		
		contadorNota++;
		
		System.out.print("Digite a segunda nota: ");
		double segundaNota = sc.nextDouble();
		
		while (segundaNota < 0 || segundaNota > 10) {
			System.out.print("Valor inválido! Tente novamente: ");
			segundaNota = sc.nextDouble();
		}
		
		contadorNota++;
		
		double media = (primeiraNota + segundaNota) / contadorNota;
		System.out.printf("MEDIA = %.2f", media);
	}
}