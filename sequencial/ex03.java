import java.util.Scanner;

public class ex03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quatro valores inteiros: ");

        int A, B, C, D, diferenca;

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        diferenca = (A * B - C * D);

        System.out.println("Diferença: " + diferenca);
    }
}
