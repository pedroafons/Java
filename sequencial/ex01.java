import java.util.Scanner;

public class ex01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois valores: ");

        int x, y, soma;
        x = sc.nextInt();
        y = sc.nextInt();

        soma = x + y;

        System.out.println("SOMA: " + soma);
    }
}
