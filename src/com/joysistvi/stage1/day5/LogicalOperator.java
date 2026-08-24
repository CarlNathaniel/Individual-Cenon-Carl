package com.joysistvi.stage1.day5;

import jdk.swing.interop.SwingInterOpUtils;

public class LogicalOperator {

    public static void main(String[] args) {

        //Logical && and ||

        //Logical &&         F       T
        System.out.println(1 > 2&& 3 > 2);

        //Logical ||         F       T
        System.out.println(1 > 2|| 3 > 2);


        /* Logical &&
            Result
        T  T  T
        T  F  F
        F  T  F
        F  F  F

        Logical ||
        T  T  T
        T  F  T
        F  T  T
        F  F  F

        */



    }
}
