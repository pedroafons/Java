import java.util.Scanner;

public class ex05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int item = sc.nextInt();
        int qntd = sc.nextInt();

        double total;

        if (item == 1) {
            total = qntd * 4;
            System.out.println("Total: R$ " + total);
        } else if (item == 2) {
            total = qntd * 4.5;
            System.out.println("Total: R$ " + total);
        } else if (item == 3) {
            total = qntd * 5;
            System.out.println("Total: R$ " + total);
        } else if (item == 4) {
            total = qntd * 2;
            System.out.println("Total: R$ " + total);
        } else {
            total = qntd * 1.5;
            System.out.println("Total: R$ " + total);
        }

        sc.close();
    }
}
