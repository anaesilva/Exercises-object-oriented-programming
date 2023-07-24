package util;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static double cotation(double amount, double dollarPrice) {
        return (amount * dollarPrice) + (amount * dollarPrice * IOF);
    }
}
