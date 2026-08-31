package com.joysistvi.stage1.day10;

import java.util.Scanner;

public class SingleDimensionalArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //                   0        1        2      3       4
        //String[] cars = {"Bugatti", "Ferrari", "Porsche", "Ford", "Nissan"};

        // Invoke an element from an array
        //System.out.println(cars[1]);

        //Invoke the last element from an array
        //System.out.println(cars[cars.length -1]);

        //Get the length of an array using length member
        //System.out.println(cars.length);

        //Traverse an array using for loop

        //Traverse an array using for-each loop

        //              0 < 5
        //for (int i = 0; i < cars.length; i++) {
        //System.out.println(cars[i]);


        // Traverse an array using for-each loop/enhance for loop

        //for (String car : cars) {
        //System.out.println(car);


//___________________________________________________________________________________


        //Syntax -> Declare an array with a specified size only
        //DataType[] object = new DataType[5];


        /*


        int[] evenNumbers = new int[5];
        evenNumbers[0] = 2;
        evenNumbers[1] = 4;
        evenNumbers[2] = 6;
        evenNumbers[3] = 8;
        evenNumbers[4] = 10;

        System.out.println(evenNumbers[3]);

        */


//______________________________________________________________________________________________________________

        int[] evenNumbers = new int[5];

        for (int i = 0; i < evenNumbers.length; i++) {
            System.out.print("Enter the first five even numbers: ");
            evenNumbers[i] = input.nextInt();
        }

        System.out.print("Traversing even numbers: ");
        for (int evenNumber : evenNumbers) {
            System.out.print(evenNumber + " ");
        }
    }

}
