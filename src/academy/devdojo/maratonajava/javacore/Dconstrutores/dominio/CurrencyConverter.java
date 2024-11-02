package dominio;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	public static final double REAL = 5.10;
	
	public static double actualPayments(double dollar , double quantityDollar) {
		return dollar * quantityDollar * (IOF + 1.0);
	}
}
