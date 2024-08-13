import java.util.Scanner;

public class CrescenteOuDecrescente {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois numeros:");
		int numero1 = sc.nextInt(), numero2 = sc.nextInt();
		
		while (numero1 != numero2) {
			if (numero1 > numero2) {
				System.out.println("DECRESCENTE!");
			} 
			
			if (numero1 < numero2) {
				System.out.println("CRESCENTE!");
			}
			
			System.out.println("Digite dois numeros:");
			numero1 = sc.nextInt();
			numero2 = sc.nextInt();
		}
	}
}