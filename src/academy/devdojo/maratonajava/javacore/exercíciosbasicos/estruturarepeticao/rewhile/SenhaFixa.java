import java.util.Scanner;

public class SenhaFixa{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a senha: ");
		int senha = sc.nextInt(), acesso = 2002;
		
		while (senha != acesso) {
			System.out.printf("Senha inválida! Tente novamente: ");
			senha = sc.nextInt();
		}
		System.out.print("Acesso permitido!");
		
	}
}