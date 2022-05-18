import java.util.Scanner;

public class ex01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x;

        System.out.println("Digite um número inteiro: ");
        x = sc.nextInt();

        if (x < 0)
            System.out.println("Negativo");
        else
            System.out.println("Não é negativo");

        sc.close();
    }
}
