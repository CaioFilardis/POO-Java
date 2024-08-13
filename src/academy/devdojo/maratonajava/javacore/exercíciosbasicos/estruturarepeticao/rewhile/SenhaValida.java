import java.util.Scanner;

/*
	Faça um programa que leia um nome de usuário e a sua senha e não 
	aceite a senha igual ao nome do usuário, mostrando uma mensagem 
	de erro e voltando a pedir as informações.
*/


public class SenhaValida{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nomeUsuario = input.nextLine();
		System.out.print("Digite sua senha: ");
		String senha = input.nextLine();
		
		while(senha.equals(nomeUsuario)) {
			System.out.print("Senha inválida! Tente novamente: ");
			senha = input.nextLine();
		}
		
		System.out.print("Acesso liberado!");
	}
}