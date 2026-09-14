package com.joysistvi.stage2.discussion.day22;

public class CashPayment extends Payment {

    public CashPayment(double balance) {
        super(balance);
    }

    // abstract method
    public void pay(double amount) {
        System.out.println("Paid " + amount + " Using Cash!");

    }

    // abstract method
    @Override
    public String getPaymentType() {
        return "Cash Payment";
    }




}
