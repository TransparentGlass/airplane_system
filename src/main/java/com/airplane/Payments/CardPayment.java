package com.airplane.Payments;
public class CardPayment extends Payment {

    private String cardNumber;

    public CardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }
    
    public void isCardValid() {
        // Simple validation: check if card number length is 16
        if (cardNumber != null && cardNumber.length() == 16) {
            System.out.println("Card is valid.");
        } else {
            System.out.println("Card is invalid.");
        }
    }

    @Override
    public void getPayment() {
        System.out.println("Card Payment Processed.");
        System.out.println("Amount: ₱" + amount);
        System.out.println("Card Number (hidden): ****" + cardNumber.substring(cardNumber.length() - 4));
    }
}