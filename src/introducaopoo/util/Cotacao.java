package util;



public class Cotacao {

	public static final double IOF = 0.06;
	
	public static double dolar(double valorDolar, double qtdDollar) {
		return (valorDolar * qtdDollar * IOF) + valorDolar * qtdDollar;
	}
}
