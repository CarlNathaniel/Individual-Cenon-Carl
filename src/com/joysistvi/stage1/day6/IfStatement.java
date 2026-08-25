package com.joysistvi.stage1.day6;

import java.util.Scanner;

public class IfStatement {

    public static void main(String[] args) {

        // (Section) Simple - If
        /*

            Syntax:
            if (condition) {
                //if block
            }
            else {
                //else block
            }

        ________________________________________________

        (Section) If-else-if ladder statement

            Syntax:
            if (condition) {
                //if block
            }
            else if (condition) {
                //else if block
            }
            else if (condition) {
                //else if block
            }
            else if (condition) {
                //else if block
            }
            else {
                //else block
            }


        */

        //Program that identifies if a temperature is fever or not

        /*

        float temp = 36.7f;

        String result = "";

        if (temp > 36.6) {
            result = "Fever";
        }
        else {
            result = "Normal Temp";
        }

        System.out.println(result);

         */

        //________________________________________________________________----

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (1-7): ");
        int day = sc.nextInt();


        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else if (day == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid Input!");

        }

    }



}
