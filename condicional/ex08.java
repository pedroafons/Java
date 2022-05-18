import java.util.Scanner;

public class ex08 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double renda = sc.nextDouble();
        double impRenda;

        if (renda < 2000){
            impRenda = 0.0;
        }else if (renda < 3000) {
            impRenda = (renda - 2000) * 0.08;
        } else if (renda < 4500) {
            impRenda = (renda - 3000) * 0.18 + 1000 * 0.08;
        } else {
            impRenda = (renda - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
        }
        if (impRenda == 0.0) {
            System.out.println("Isento");
        } else {
            System.out.printf("R$ %.2f%n", impRenda);
        }


        sc.close();
    }
}
