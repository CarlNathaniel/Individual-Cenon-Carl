package com.joysistvi.stage1.day3;

public class Activity_Cenon {

    public static void main(String[] args) {

        String companyName = "Microsoft Corporation";
        short numberOfOperationAroundTheWorld = 100;
        byte ageOfCopmany = 51;
        int numberOfEmployee = 223_000;
        long netWorth = 3_580_000_000_000L;
        double lastYrRevenue = 281.724;
        float increaseInRevenue = 14.93F;
        boolean isActive = true;
        char currency = '$';

        System.out.println("Company Name: " + companyName);
        System.out.println("Operate in over " + numberOfOperationAroundTheWorld + " " + "Country");
        System.out.println("Founded " + ageOfCopmany + " Years Ago");
        System.out.println("Total Number of Employees: " + numberOfEmployee);
        System.out.println("Net Worth: " + netWorth + currency);
        System.out.println("2025 Total Revenue: " + lastYrRevenue + " billion, a " + increaseInRevenue + "% Increase from 2024");
        System.out.println("Was Microsoft co-founded by Bill Gates and Paul Allen? " + isActive);
    }
}
