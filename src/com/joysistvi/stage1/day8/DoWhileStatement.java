package com.joysistvi.stage1.day8;

import java.util.Scanner;

public class DoWhileStatement {

    public static void main(String[] args) {

        // [Syntax] Do-While Loop

        /*
                initialization; - optional
            do {
                statement/body of the loop
               increment/decrement - optional
             } while (condition);
         */

        //Print numbers from 1 - 10

//        int i = 1;
//        do {
//            System.out.println(i);
//            i++;
//        } while (i <= 10);

        Scanner scanner = new Scanner(System.in);

        String email = "carl@gmail.com";
        String password = "password123";

        boolean isLoggedIn = false;

        do {
            System.out.print("Enter email: ");
            String loginEmail = scanner.nextLine();

            System.out.print("Enter password: ");
            String loginPass = scanner.nextLine();

            if (loginEmail.equals(email) && loginPass.equals(password)) {
                System.out.println("Login Successfully!");

                isLoggedIn = true; //stop the while loop
            } else {
                System.out.println("Invalid Username or Password!");
            }
        } while (!isLoggedIn);

    }
}
