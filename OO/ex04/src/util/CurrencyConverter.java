package util;

public class CurrencyConverter {

    public static double converter(double dollarPrice, double dollar) {
        double inReal = dollarPrice * dollar;
        inReal += inReal * 0.06;
        return inReal;
    }
}
