package com.joysistvi.stage1.day8;

import java.util.Scanner;

public class SimpleLogin {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String email = "carl@gmail.com";
        String password = "password123";

        int maxAttempts = 3;

        boolean isLoggedIn = false;
        while (!isLoggedIn) {
            System.out.print("Enter email: ");
            String loginEmail = scanner.nextLine();

            System.out.print("Enter Password: ");
            String loginPass = scanner.nextLine();

            if (loginEmail.equals(email) && loginPass.equals(password)) {
                System.out.println("Login Successfully!");
                isLoggedIn = true; //stop the while loop
            } else {
                System.out.println("Invalid Username or Password!");
            }

        }
    }

        //The program must identify if the username/password is invalid

}

/*
    String
    .equals

    Number
    ==
 */
