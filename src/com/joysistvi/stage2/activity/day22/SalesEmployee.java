package com.joysistvi.stage2.activity.day22;

public class SalesEmployee extends Employee implements Bonusable {

    public static final double TAX_RATE = 0.12;
    public double commission;

    public SalesEmployee (String name, double baseSalary, double commission) {
        super(name, baseSalary);
        this.commission = commission;
    }
    @Override
    public double computeSalary() {
        return baseSalary + commission;
    }

    @Override
    public String getEmployeeType() {
        return "Sales Employee";
    }

    @Override
    public double computeDeductions() {
        return computeSalary() * TAX_RATE;
    }

    @Override
    public double computeBonus () {
        return commission;
    }

    @Override
    public boolean isEligibleForBonus() {
        return true;
    }

}
