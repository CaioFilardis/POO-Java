import java.util.Scanner;

/*
	Altere o programa anterior permitindo ao usuário informar as
	populações e as taxas de crescimento iniciais. Valide a entrada e
	permita repetir a operação.
*/

public class  InputPopulacaoTotal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int contador = 0;
		
		System.out.print("Digite a populacao total do país A: ");
		float populacaoTotalPaisA = input.nextFloat();
		System.out.print("Digite a taxa de crescimento anual: ");
		float taxaAnualPaisA = input.nextFloat();
		
		System.out.print("Digite a populacao total do país B: ");
		float populacaoTotalPaisB = input.nextFloat();
		System.out.print("Digite a taxa de crescimento anual: ");
		float taxaAnualPaisB = input.nextFloat();
		
		float calculoAnualPaisA = 0, calculoAnualPaisB = 0;
		
		while (populacaoTotalPaisA < populacaoTotalPaisB) {
			calculoAnualPaisA = calculoAnualPaisA + (populacaoTotalPaisA * taxaAnualPaisA);
			populacaoTotalPaisA = calculoAnualPaisA;
			System.out.printf("Poulação A: %.2f%n%n", populacaoTotalPaisA);
			
			calculoAnualPaisB = calculoAnualPaisB + (populacaoTotalPaisB * taxaAnualPaisB);
			populacaoTotalPaisB = calculoAnualPaisB;
			System.out.printf("População B: %.2f%n%n", populacaoTotalPaisB);
			
			contador++;
		}
		
		System.out.print("Numero de anos para a população A ultrapassar a população B e: \n");
		System.out.printf("%d anos", contador);
		
	}
}