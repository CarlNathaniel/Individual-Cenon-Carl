package com.joysistvi.stage1.day4;

public class Activity2_Cenon {

    public static void main(String[] args) {

        double income = 50000;
        double foodAllowance = 15000;
        double transportation = 2500;
        double rent = 4500;
        double utilityBill = 3500;
        double remaining = income - foodAllowance - transportation - rent - utilityBill;

        System.out.printf("Income: %.0f \n", income );
        System.out.printf("Food Allowance: %.1f%% \n", foodAllowance / income * 100);
        System.out.printf("Transportation: %.1f%% \n" , transportation / income * 100);
        System.out.printf("Rent: %.1f%% \n", rent / income * 100);
        System.out.printf("Utility Bill: %.1f%% \n", utilityBill / income * 100);
        System.out.printf("Remaining Balance: %.0f \n", remaining);



    }
}
