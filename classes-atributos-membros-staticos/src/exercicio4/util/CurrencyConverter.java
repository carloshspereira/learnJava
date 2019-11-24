package exercicio4.util;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static double dollarToReal(double dollarPrice, double dollarQuantity) {
		
		return dollarPrice*dollarQuantity*(1+IOF);
	}

}
