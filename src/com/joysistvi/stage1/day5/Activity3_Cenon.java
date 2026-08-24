package com.joysistvi.stage1.day5;

public class Activity3_Cenon {

    public static void main(String[] args) {

        int age = 20;
        boolean hasValidId = true;

        String allowed = age >= 18 && hasValidId ? "Yes" : "No";

        System.out.println("Allowed to enter the event: " + allowed);


    }
}
