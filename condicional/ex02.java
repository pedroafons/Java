import java.util.Scanner;

public class ex02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x;

        System.out.println("Digite um número inteiro: ");
        x = sc.nextInt();

        if (x % 2 == 0)
            System.out.println("Par");
        else
            System.out.println("Impar");

        sc.close();
    }
}
