package com.tnsif.interface1;
import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nChoose Payment Method: 1. Credit Card 2. Debit Card 3. UPI 4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt(); scanner.nextLine();
            
            if (choice == 4) {
                System.out.println("Exiting Payment System. Thank you!");
                break;
            }
            
            payment payment = null;

            if (choice == 1) {
                System.out.print("Enter Credit Card Number: ");
                payment = new CreditCard(scanner.nextLine());
            } else if (choice == 2) {
                System.out.print("Enter Debit Card Number: ");
                payment = new DebitCard(scanner.nextLine());
            } else if (choice == 3) {
                System.out.print("Enter UPI ID: ");
                payment = new UPI(scanner.nextLine());
            } else {
                System.out.println("Invalid Choice! Please try again.");
                continue;
            }

            System.out.print("Enter Amount: Rs. ");
            double amount = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
            
            payment.process(amount);
            System.out.println("Payment Successful!");
        }
        
        scanner.close();
    }
}
