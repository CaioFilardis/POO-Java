import java.util.Scanner;

/*
	Fazer um programa para ler uma quantidade N (supor N > 0), depois ler os dados de N atletas (nome, 
	sexo, altura, peso). Depois, mostrar um relatório contendo: 
	
	 Peso médio dos atletas 
	 Nome do atleta mais alto 
	 Porcentagem de homens 
	 Altura média das mulheres 
	
	Caso não sejam digitadas mulheres, a altura média não poderá ser calculada (pois divisão por zero não 
	existe). Neste caso, apenas mostrar a mensagem "Não há mulheres cadastradas". 
	Fazer validações de dados para altura e peso, não permitindo digitar valores não positivos para esses 
	dados. Faça também a validação do sexo, não permitindo valores diferentes de F e M. 
*/

public class DesafioAtletasJava {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float maisAlto = 0, pesoGeral = 0, quantidadeHomem = 0, quantidadeMulher = 0, alturaMediaDaMulher = 0;
		String nomeDoMaisAlto = "";
		
		
		System.out.print("Qual a quantidade de atletas? ");
		int quantidadeAtletas = input.nextInt();
		
		for (int i = 1; i <= quantidadeAtletas; i++) {
			System.out.println("Digite os dados do atleta numero "+i+":");
			
			System.out.print("Nome: ");
			input.nextLine();
			String nome = input.nextLine();
			System.out.print("Sexo: ");
			char sexo = input.next().charAt(0);
			
			while (sexo != 'F' && sexo != 'M') {
				System.out.print("Valor inválido! Favor, digitar F ou M: ");
				sexo = input.next().charAt(0);
			}
			
			if (sexo == 'M') {
					quantidadeHomem++;
				}
				
			if (sexo == 'F') {
				quantidadeMulher++;
			}
				
			
			System.out.print("Altura: ");
			float altura = input.nextFloat();
			
			while (altura <= 0) {
				
				System.out.print("Valor inválido! Favor, digitar um valor positivo: ");
				altura = input.nextFloat();
			}
			
			if (sexo == 'F') {
				alturaMediaDaMulher += altura;
			}
			
			System.out.print("Peso: ");
			float peso = input.nextFloat();
			
			while (peso <= 0) {
				System.out.print("Valor inválido! Favor, digitar um valor positivo: ");
				peso = input.nextFloat();
			}
			
			pesoGeral += peso;
			
			if (maisAlto < altura) {
				maisAlto = altura;
				nomeDoMaisAlto = nome;
			}
		}
	
		System.out.println("\nRELATORIO:");
		System.out.printf("Peso médio dos atletas: %.2f%n", (pesoGeral / quantidadeAtletas));
		System.out.println("Nome do mais alto: "+nomeDoMaisAlto);
		System.out.printf("Porcentagens de homens: %.2f%n ", (quantidadeHomem * 100) / quantidadeAtletas);
		
		
		if (quantidadeMulher == 0) {
			System.out.print("Não há mulheres cadastradas\n");
		} else {
			System.out.printf("Altura média das mulheres: %.2f", (alturaMediaDaMulher / quantidadeAtletas));
		}
		
		if (quantidadeHomem == 0) {
			System.out.print("Não há homens cadastradas\n");
		}
	}
}