package application;

import entities.Account;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int accNumber = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String accName = sc.nextLine();
        System.out.print("Is there a initial deposit? (y/n) ");
        char reponse = sc.next().charAt(0);
        if (reponse == 'y'){
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(accNumber, accName, initialDeposit);
        } else {
            account = new Account(accNumber, accName);
        }

        System.out.println("\nAccount data: ");
        System.out.println(account);

        System.out.print("\nEnter a deposit value: ");
        account.deposit(sc.nextDouble());
        System.out.println("Updated account data: ");
        System.out.println(account);

        System.out.print("\nEnter a withdraw value: ");
        account.withdraw(sc.nextDouble());
        System.out.println("Updated account data: ");
        System.out.println(account);

        sc.close();
    }
}
