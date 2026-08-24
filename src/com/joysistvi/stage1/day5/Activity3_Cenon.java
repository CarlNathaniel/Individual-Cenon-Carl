package com.joysistvi.stage1.day5;

public class Activity3_Cenon {

    public static void main(String[] args) {

        int age = 20;
        boolean hasValidId = true;

        String allowed = age >= 18 && hasValidId ? "Yes" : "No";

        System.out.println("Task 2: Event Entry Check ");;
        System.out.println("Allowed to enter the event: " + allowed );

        //___________________________________________________________________


        boolean isWeekend = true;
        boolean isHoliday = false;

        String noClasses = isHoliday || isWeekend ? "Yes, no Classes." : "No, we have classes today";

        System.out.println("\nTask 3: Class Status Check");
        System.out.println("Are there no classes today? " + noClasses);

        //___________________________________________________________________


        int score = 90;
        String grades = (score > 75) ? "Passed" : "Failed";

        System.out.println("\nTask 4: Pass or Fail Check");
        System.out.println("Score: " + score);
        System.out.println("Result: " + grades);

        //___________________________________________________________________


        int num1 = 100;
        int num2 = 50;

        int largerNumber = (num1 > num2) ? num1 : num2;

        System.out.println("\nTask 5: Larger Number Check");
        System.out.println("Number 1: "+ num1 + " " + "Number 2: " + num2);
        System.out.println("The larger number is: " + largerNumber);

    }
}
