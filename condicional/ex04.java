import java.util.Scanner;

public class ex04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int inicio = sc.nextInt();
        int fim = sc.nextInt();

        int duracao;

        if (fim > inicio) {
            duracao = fim - inicio;
        } else {
            duracao = 24 - inicio + fim;
        }

        System.out.println("O jogo durou " + duracao + " Hora(s)");

        sc.close();
    }
}
