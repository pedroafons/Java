package application;

import entities.Student;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Name: ");
        student.name = sc.next();
        System.out.print("Grade 1: ");
        student.grade1 = sc.nextDouble();
        System.out.print("Grade 2: ");
        student.grade2 = sc.nextDouble();
        System.out.print("Grade 3: ");
        student.grade3 = sc.nextDouble();

        System.out.println("\nFINAL GRADE: " + student.finalGrade());

        if (student.finalGrade() < 60.00) {
            System.out.println("FAILED!");
            System.out.println("MISSING " + student.missing() + " POINTS");
        } else {
            System.out.println("PASS!");
        }

        sc.close();
    }
}
