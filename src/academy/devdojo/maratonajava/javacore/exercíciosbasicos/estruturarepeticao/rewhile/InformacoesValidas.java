import java.util.Scanner;

/*
	Faça um programa que leia e valide as seguintes informações:
	a. Nome: maior que 3 caracteres;
	b. Idade: entre 0 e 150;
	c. Salário: maior que zero;
	d. Sexo: 'f' ou 'm';
	e. Estado Civil: 's', 'c', 'v', 'd';
*/

public class InformacoesValidas {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um nome: ");
		String algumNome = input.nextLine();
		int numeroDeCaracteres = algumNome.length();
		
			
		while (numeroDeCaracteres <= 3) {
			System.out.print("Quantidade insuficiente de caracteres! Tente novamente: ");
			algumNome = input.nextLine();
			numeroDeCaracteres = algumNome.length();
		}
			
		System.out.print("Digite uma idade: ");
		int algumaIdade = input.nextInt();
			
		while (algumaIdade < 0 || algumaIdade > 150) {
			System.out.print("Idade inválida!! Tente novamente: ");
			algumaIdade = input.nextInt();
		}
			
		System.out.print("Digite um salario: ");
		float salario = input.nextFloat();
			
		while (salario < 0) {
			System.out.print("Salario inválido!! Tente novamente: ");
			salario = input.nextFloat();
		}
			
		System.out.print("Digite um sexo: ");
		char sexo = input.next().charAt(0);
			
		while (sexo != 'f' && sexo != 'm') {
			System.out.print("Caractere inválido!! Tente novamente: ");
			sexo = input.next().charAt(0);
		}
			
		System.out.print("Digite sue estado civil: ");
		char estadoCivil = input.next().charAt(0);
			
		while (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd') {
			System.out.print("Estado civil inválida: ");
			estadoCivil = input.next().charAt(0);
		}
	}
}