package com.joysistvi.stage1.day9;

public class NestedForLoop {

    public static void main(String[] args) {

        /*


        for (int i = 1; i <= 3; i++) {//outer for loop
            System.out.println(i);

            //              1 <= 3
            for (int j = 1; j <= 3; j++) {//inner for loop
                System.out.println("\t" + j);
            }
        }


         */


//___________________________________________________________________

        /*


        for (int i = 0; i <= 3; i++) { // outer loop

            for (int j = 1; j <= 3; j++) { // inner loop
                System.out.println(i + " " + j);
            }
            System.out.println(); // new line
        }


         */


//_____________________________________________________________________________

        /*


        for (int i = 1; i <= 3; i++) { // outer loop

            for (int j = 1; j <= i; j++) { // inner loop
                System.out.println(i + " " + j);
            }
            System.out.println(); // new line
        }


         */


//______________________________________________________________________________________

        /*


        for (int i = 5; i >= 1; i--) { // outer loop

            for (int j = 1; j <= i; j++) { // inner loop
                System.out.print("* ");
            }

            System.out.println(); // new line
        }


         */


//_________________________________________________________________________________________


        for (int i = 1; i <= 10; i++){
            for (int j = 1; j <= 10; j++) {
                    int product = i * j;
                System.out.println(i + " * " + j + " = " + product);
            }
            System.out.println();
        }

    }

}

//Whenever an outer loop executes, inner loop executes completely
