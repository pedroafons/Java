import java.util.Scanner;

public class ex09 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            double x = sc.nextDouble();
            double y = sc.nextDouble();

            if (y == 0) {
                System.out.println("divisao impossivel");
            } else {
                double div = x / y;
                System.out.printf("%.1f%n", div);
            }
        }

        sc.close();
    }
}
