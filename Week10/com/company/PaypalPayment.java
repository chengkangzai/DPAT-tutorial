package com.company;

public class PaypalPayment implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("Paypal payment with amount of " + amount);
    }
}
