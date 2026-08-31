package com.joysistvi.stage1.day10;

import java.util.Scanner;

public class Activity8_Cenon {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 5 numbers:");

        int[] numbers = new int [5];

        int sum = 0;


        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();

            sum += numbers[i];
        }

        double average = (double) sum/numbers.length;

        System.out.println();
        System.out.println("You entered:");

        for (int j = 0 ; j < numbers.length; j++) {
            System.out.println("Index " + j + ": " + numbers[j]);
        }

        System.out.println();

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }

}
