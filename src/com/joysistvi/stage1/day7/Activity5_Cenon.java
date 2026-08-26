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
                if (depositAmount <= 0) {
                    System.out.println("Error");
                } else {
                    System.out.println("Deposit successful. New Balance: " + (depositAmount + balance));
                }
                break;
            case 3:
                System.out.print("Enter amount to withdraw: ");
                double withdrawAmount = input.nextDouble();
                if (withdrawAmount <= 0) {
                    System.out.println("Error");
                } else if (withdrawAmount >= 5001) {
                    System.out.println("Insufficient Balance. Your Current balance is: " + balance);
                } else {
                    System.out.println("Withdrawal successful!");
                    System.out.println("Remaining balance: " + (balance - withdrawAmount));
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
