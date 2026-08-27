package com.joysistvi.stage1.day7;

import java.util.Scanner;

public class Activity5_Cenon {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double balance = 5000.00;

        System.out.println("=== SIMPLE ATM MENU ===");
        System.out.println("1 - Check Balance");
        System.out.println("2 - Deposit");
        System.out.println("3 - Withdraw");
        System.out.println("4 - Exit");

        System.out.print("Enter choice (1-4): ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Your current balance is: " + balance);
                break;
            case 2:
                System.out.print("Enter amount to deposit: ");
                double depositAmount = input.nextDouble();
                if (depositAmount > 0) {

                    // Nested if
                    if (depositAmount >= 5000) {
                        System.out.println("Large deposit detected!");
                        System.out.println("Deposit successful. New Balance: " + (depositAmount + balance));
                    } else {
                        System.out.println("Deposit successful. New Balance: " + (depositAmount + balance));
                    }

                } else {
                    System.out.println("Error");
                }

                break;

            case 3:
                System.out.print("Enter amount to withdraw: ");
                double withdrawAmount = input.nextDouble();

                if (withdrawAmount <= 1000000) {

                    if (withdrawAmount <= 0) {
                        System.out.println("Error");
                    } else if (withdrawAmount > balance) {
                        System.out.println("Insufficient Balance");
                    } else if (withdrawAmount > 0) {
                        System.out.println("Withdraw Successful. New Balance: " + (balance - withdrawAmount));
                    }
                } else {
                    System.out.println("Invalid Input");
                }
                break;
            case 4:
                System.out.println("Thank you for using Simple ATM. Goodbye!");
                break;
            default:
                System.out.println("Invalid Input");




        }

        input.close();

    }
}
