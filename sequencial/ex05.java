import java.util.Scanner;

public class ex05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int codP1, numP1, codP2, numP2;
        double valorP1, valorP2, total;

        System.out.println("Digite o codigo da peça 1 e 2: ");
        codP1 = sc.nextInt();
        codP2 = sc.nextInt();

        System.out.println("Digite o numero de cada peça: ");
        numP1 = sc.nextInt();
        numP2 = sc.nextInt();

        System.out.println("Digite o valor de cada peça: ");
        valorP1 = sc.nextDouble();
        valorP2 = sc.nextDouble();

        total = (numP1 * valorP1) + (numP2 * valorP2);

        System.out.printf("Valor a pagar: R$ %.2f", total);
    }
}
