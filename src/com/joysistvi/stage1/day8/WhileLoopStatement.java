package com.joysistvi.stage1.day8;

import java.util.Scanner;

public class WhileLoopStatement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // [Syntax]

        /*

            initialization - optional
            while (condition) {
                statement/body of the loop
                increment/decrement - optional
            }

//_______________________________________________________________

         */

        //Print numbers from 1 - 10

//        int i = 1;
//        while (i <= 10) {
//            System.out.println(i);
//            i++;
//        }

//______________________________________________________________________

    boolean isRunning = false;

    while (!isRunning) {
        System.out.print("Type 'exit' to stop: ");
        String input = scanner.nextLine();

        if (input.equals("exit")) {
            System.out.println("Program stopped!");
            isRunning = true;
        }
    }

    // flag -> used to track/mark a variable whether a specific condition or event has occured

    }
}

/*
    While loop - used when the number of repetition is unknown in advance
 */
