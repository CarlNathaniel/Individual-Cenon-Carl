package com.joysistvi.stage2.activity.day22;

public class RegularEmployee extends Employee implements Auditable, Bonusable {
    private static final double ATTENDANCE_BONUS = 1000;
    private static final double TAX_RATE = 0.10;
    public RegularEmployee(String name, double baseSalary) {
        super(name, baseSalary);
    }
    @Override
    public double computeSalary() {
        return baseSalary + ATTENDANCE_BONUS;
    }

    @Override
    public String getEmployeeType() {
        return "Regular Employee";
    }

    @Override
    public double computeDeductions() {
        return computeSalary() * TAX_RATE;
    }

    @Override
    public double computeBonus () {
        return ATTENDANCE_BONUS;
    }

    @Override
    public boolean isEligibleForBonus() {
        return true;
    }

    @Override
    public String generateEmployeeId() {
        return "REG-" + name;
    }

    @Override
    public void logSalaryComputation (String employeeId){
        System.out.println("Audit log: " + generateEmployeeId() + " salary computed");
    }

}
