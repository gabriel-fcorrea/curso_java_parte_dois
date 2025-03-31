package util;

public class CurrencyConverter {

	public static final double IOF = 1.06;

	public static double dollarConversor(double dollarBought, double dollarPrice) {
		return (dollarBought * dollarPrice) * IOF;
	}

}
