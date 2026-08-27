package com.joysistvi.stage1.day8;

public class ForLoopStatement {

    public static void main(String[] args) {

        // [Syntax] For Loop

        /*

            for (initialization; condition; increment/decrement) {
                statement/body of the loop
            }

         */


//___________________________________________________________________

        /*

        for (int i = 10; i >= 0; i--) {
            System.out.print(i + " ");
        }

         */

//______________________________________________________________________________


        /*

        for (int i = 0; i < 30; i++) {
            System.out.println(i + 1 + " : Carl");
        }

         */

        //Print numbers from 5 - 20
        //Print your name 30 times
        //Print the first 10 even numbers

//        for (int i = 2; i <= 20; i+=2) {
//            System.out.print(i + " ");
//        }

        for (int i = 1; i <= 20; i++) {
            System.out.println(++i);
        }

    }
}
