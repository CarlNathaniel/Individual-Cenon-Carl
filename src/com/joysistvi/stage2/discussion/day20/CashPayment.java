package com.joysistvi.stage2.discussion.day20;

public class CashPayment extends Payment{

    public CashPayment (double balance) {
        super(balance);
    }

    @Override
    void pay(double amount){
        System.out.println("Paid " + amount + " using Cash!");
    }
}
