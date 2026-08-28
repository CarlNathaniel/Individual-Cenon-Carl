package com.joysistvi.stage1.day8;

import java.util.Scanner;

public class LoginWithAttempts {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String email = "carl@gmail.com";
        String password = "pass123";

        int maxAttempts = 0;

        boolean isLoggedIn = false;


        do {
            System.out.print("Enter email: ");
            String loginEmail = scanner.nextLine();

            System.out.print("Enter password: ");
            String loginPass = scanner.nextLine();

            maxAttempts++;// add attempts

            if (loginEmail.equals(email) && loginPass.equals(password)) {
                System.out.println("Login Successfully!");
                isLoggedIn = true;

            } else if (!loginEmail.equals(email) && !loginPass.equals(password)) {
                System.out.println("Incorrect email and password. Please try again.");
                System.out.println("Attempts remaining: " + (3 - maxAttempts));
            } else if (loginPass.equals(password)) { //Shows when email is incorrect
                System.out.println("Incorrect email. Please try again.");
                System.out.println("Attempts remaining: " + (3 - maxAttempts));
            } else if (loginEmail.equals(email)) { //Shows when password is incorrect
                System.out.println("Incorrect password. Please try again");
                System.out.println("Attempts remaining: " + (3 - maxAttempts));
            }

            } while (!isLoggedIn && maxAttempts < 3) ;//Limit the attempts to 3

            if (!isLoggedIn) {
                System.out.println("You ran out of attempts.");
            }

            scanner.close();

        }



    }


