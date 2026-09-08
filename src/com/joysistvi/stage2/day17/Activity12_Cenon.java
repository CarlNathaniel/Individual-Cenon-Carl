package com.joysistvi.stage2.day17;

import java.util.Scanner;

public class Activity12_Cenon {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== Method 1 ===");
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

        System.out.println();
        System.out.println("=== Method 2 ===");

        for (int i = 0; i <= 50; i++) {
            System.out.println("Carl Nathaniel Cenon");
        }

        System.out.println();
        System.out.println("=== Method 3 ===");
        System.out.print("Enter a number: ");
        double squareRoot = input.nextDouble();
        double squareRootOutput = Math.sqrt(squareRoot);
        System.out.printf("Square root: %.2f", squareRootOutput);

        System.out.println();
        System.out.println();
        System.out.println("=== Method 4 ===");
        System.out.print("Enter a base: ");
        double base = input.nextDouble();
        System.out.print("Enter a exponent: ");
        double exponent = input.nextDouble();

        double baseExpoResult = Math.pow(base, exponent);
        System.out.printf("Result: %.2f", baseExpoResult);

        System.out.println();
        System.out.println();
        System.out.println("=== Method 5 ===");

        int randomNumber = (int)(Math.random() * 100) + 1;
        System.out.println("Random number: " + randomNumber);

        System.out.println();
        System.out.println("=== Method 6 ===");
        System.out.print("Enter a radius: ");
        double givenRadius = input.nextDouble();
        double area = Math.PI * Math.pow(givenRadius, 2);
        System.out.printf("Area of the circle: %.2f", area);

        System.out.println();
        System.out.println();
        System.out.println("=== Method 7 ===");
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        if (age >= 18) {
            System.out.println("You are a voter.");
        } else {
            System.out.println("You are not a voter.");
        }

        System.out.println();
        System.out.println("=== Method 8 ===");

        String word = "Programming";
        System.out.println("Word: " + word);

        int length = word.length();
        System.out.println("Word Length: " + length);

        System.out.println();
        System.out.println("=== Method 9 ===");
        System.out.println("Word: Hello World");
        String reverseWord = "Hello World";
        System.out.print("Reverse Word: ");
        for (int i = reverseWord.length() -1; i >= 0; i--) {
            System.out.print(reverseWord.charAt(i));

        }

        System.out.println();
        System.out.println();
        System.out.println("=== Method 10 ===");

        input.nextLine();
        System.out.print("Enter your Full Name: ");
        String fullName = input.nextLine();

        System.out.print("Enter your Age: ");
        int userAge = input.nextInt();

        System.out.println("Full Name: " + fullName);

        System.out.println("Age: " + userAge);

    }
}
