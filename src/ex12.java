import java.util.Scanner;

public class ex12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            int col1 = i;
            int col2 = i * i;
            int col3 = i * i * i;

            System.out.println(col1 + " " + col2 + " " + col3);
        }

        sc.close();
    }
}
