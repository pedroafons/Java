import java.util.Scanner;

public class ex04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number;
        double horasTrab, valorHora, salario;

        System.out.println("Digite o numero do funcionario: ");
        number = sc.nextInt();

        System.out.println("Digite o numero de horas trabalhadas: ");
        horasTrab = sc.nextDouble();

        System.out.println("Digite o valor da hora: ");
        valorHora = sc.nextDouble();

        salario = horasTrab * valorHora;

        System.out.printf("NUMBER: " + number + "\r\nSALARY: %.2f",  salario);
    }
}
