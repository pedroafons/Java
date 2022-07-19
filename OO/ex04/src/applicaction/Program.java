package applicaction;

import util.CurrencyConverter;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double dollar = sc.nextDouble();

        double inReal = CurrencyConverter.converter(dollarPrice, dollar);

        System.out.printf("Amount to be paid in reais: %.2f%n", inReal);

        sc.close();
    }
}
