package com.joysistvi.stage1.day5;

public class TernaryOperator {

    public static void main(String[] args) {

        //syntax
        // (condition) ?  true block : false block;
        //Condition - if it returns true or false

        //int num = 1;
        int num = 10;

        //Program that identifies if the number is positive or negative
        String numberType = (num > 0) ? "Positive" : "Negative";
        System.out.println(numberType + " Number");


        //Program that identifies if the number is odd or even

        //int num2 = 100;
        int num2 = 201;

        String numberCategory = num2 % 2 == 0 ? "Even" : "Odd";
        System.out.println(numberCategory + " Number");


    }
}
