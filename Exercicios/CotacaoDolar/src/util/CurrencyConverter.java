package util;

public class CurrencyConverter {

	public static final double  PCENT = 0.07;
	
	public static double cotacao(double dolar, double compra) {
		return dolar * compra - (dolar * compra * PCENT);
	}
		
}
