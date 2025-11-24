package com.airplane.Payments;
public class CardPayment extends Payment {

    private String cardNumber;

    public CardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    public void getPayment() {
        System.out.println("Card Payment Processed.");
        System.out.println("Amount: ₱" + amount);
        System.out.println("Card Number (hidden): ****" + cardNumber.substring(cardNumber.length() - 4));
    }
}