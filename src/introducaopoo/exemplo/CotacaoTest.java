package exemplosAulas;

import util.Cotacao;

public class CotacaoTest {
	
	public static void main(String[] args) {
		
		double valorDolar = 3.10;
		System.out.printf("What is the dollar price? %.2f%n", valorDolar);
		
		double quantidadeDolares = 200.00;
		System.out.printf("How many dollars will be bought? %.2f%n", quantidadeDolares);
		
		double dollarParaReal = Cotacao.dolar(valorDolar, quantidadeDolares);
		
		System.out.printf("Amount to be paid in reais = %.2f%n", dollarParaReal);
	}

}
