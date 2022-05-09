import java.util.Scanner;

public class ex06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo, pi = 3.14159;

        System.out.println("Digite valores para A, B e C: ");

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        triangulo = (A * C) / 2;
        circulo = pi * Math.pow(C, 2);
        trapezio = ((A + B) * C) / 2;
        quadrado = Math.pow(B, 2);
        retangulo = A * B;

        System.out.printf("TRIÂNGULO: %.3f%n", triangulo);
        System.out.printf("CÍRCULO: %.3f%n", circulo);
        System.out.printf("TRAPÉZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETÂNGULO: %.3f%n", retangulo);
    }
}
