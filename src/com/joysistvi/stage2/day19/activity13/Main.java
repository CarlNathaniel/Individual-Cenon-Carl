package com.joysistvi.stage2.day19.activity13;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("*******************************");
        System.out.println("*  User Account Registration  *");
        System.out.println("*******************************");

        System.out.print("\nEnter First Name: ");
        String firstName = input.nextLine();


        System.out.print("Enter Middle Name: ");
        String middleName = input.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = input.nextLine();


        System.out.print("Enter Address: ");
        String address = input.nextLine();

        System.out.print("Enter Email: ");
        String email = input.nextLine();

        System.out.print("Enter Password: ");
        String password = input.nextLine();


        UserAccount useracct = new UserAccount(
                firstName,
                middleName,
                lastName,
                address,
                email,
                password);

        System.out.println("\n=== User Account Created ===");

        System.out.println("Full Name: " + useracct.getFirstName() + " " + useracct.getMiddleName() + " " + useracct.getLastName());
        System.out.println("Address: " + useracct.getAddress());
        System.out.println("Email: " + useracct.getEmail());

    }
}
