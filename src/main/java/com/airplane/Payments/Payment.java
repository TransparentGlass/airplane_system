package com.airplane.Payments;

public abstract class Payment {
    protected double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    public abstract void getPayment();
}

