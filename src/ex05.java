import java.util.Scanner;

public class ex05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int alcool = 0, gasolina = 0, diesel = 0;
        int num = sc.nextInt();

        while (num != 4) {
            if (num != 1 && num != 2 && num != 3) {
                num = sc.nextInt();
            } else if (num == 2) {
                gasolina += 1;
                num = sc.nextInt();
            } else if (num == 3) {
                diesel += 1;
                num = sc.nextInt();
            } else {
                alcool += 1;
                num = sc.nextInt();
            }
        }

        System.out.println("MUITO OBRIGADO!");
        System.out.println("Álcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}
