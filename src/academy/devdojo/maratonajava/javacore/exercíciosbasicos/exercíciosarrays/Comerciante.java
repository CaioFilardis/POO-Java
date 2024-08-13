package exerciciosarrays;

import java.util.Scanner;

/*Um comerciante deseja fazer o levantamento do lucro das mercadorias que ele comercializa. Para isto, 
mandou digitar um conjunto de N mercadorias, cada uma contendo nome, preço de compra e preço de 
venda das mesmas. Fazer um programa que leia tais dados e determine e escreva quantas mercadorias 
proporcionaram: 
 lucro < 10% 
 10% ≤ lucro ≤ 20% 
 lucro > 20% 
Determine e escreva também o valor total de compra e de venda de todas as mercadorias, assim como 
o lucro total. */

public class Comerciante {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int lucroAbaixo = 0, lucroEntre = 0, lucroAcima = 0;
		float somaPrecoCompra = 0.0F, somaPrecoVenda = 0.0F, calculandoLucro = 0.0F;
		
		System.out.print("Serao digitados dados de quantos produtos? ");
		int quantidadeDeProdutos = input.nextInt();
		
		String[] nomeProduto = new String[quantidadeDeProdutos];
		float[] precoCompra = new float[quantidadeDeProdutos];
		float[] precoVenda = new float[quantidadeDeProdutos];
		
		for (int i = 0; i < quantidadeDeProdutos; i++) {
			System.out.printf("Produto %d%n", i+1);
			input.nextLine();
			System.out.print("Nome: ");
			nomeProduto[i] = input.next();
			System.out.print("Preco de compra: ");
			precoCompra[i] = input.nextFloat();
			System.out.print("Preco de venda: ");
			precoVenda[i] = input.nextFloat();
			
			somaPrecoCompra += precoCompra[i];
			somaPrecoVenda += precoVenda[i];
		}
		
		System.out.println();
		
		for (int i = 0; i < quantidadeDeProdutos; i++) {
			calculandoLucro = ((precoVenda[i] - precoCompra[i]) * 100) / precoCompra[i];
			
			if (calculandoLucro < 10) {
				lucroAbaixo++;
			} else if (calculandoLucro >= 10 && calculandoLucro <= 20) {
				lucroEntre++;
			} else {
				lucroAcima++;
			}
		}
		
		System.out.println("RELATORIO:");
		System.out.println("Lucro abaixo de 10%: "+ lucroAbaixo);
		System.out.println("Lucro entre 10% e 20%: "+ lucroEntre);
		System.out.println("Lucro acima de 20%: "+ lucroAcima);
		
		System.out.printf("Valor total de compra: %.2f%n", somaPrecoCompra);
		System.out.printf("Valor total da venda: %.2f%n", somaPrecoVenda);
		double lucroTotal = somaPrecoVenda - somaPrecoCompra;
		System.out.printf("Lucro total: %.2f", lucroTotal);
	}
}
