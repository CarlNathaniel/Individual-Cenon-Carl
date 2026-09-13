package com.joysistvi.stage2.activity.day21;

public class RegularEmployee extends Employee{

    private final double attendance = 1000;

    public RegularEmployee(String name, double baseSalary) {
        super(name, baseSalary);

    }
    @Override
    public double computeSalary() {
        return baseSalary + attendance;
    }
}
