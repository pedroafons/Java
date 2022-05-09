import java.util.Scanner;

public class ex02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double raio, area, pi = 3.14159;

        System.out.println("Digite o valor do raio do circulo: ");
        raio = sc.nextInt();

        area = pi * Math.pow(raio, 2);

        System.out.printf("A area do circulo e: %.4f%n", area);
    }
}
