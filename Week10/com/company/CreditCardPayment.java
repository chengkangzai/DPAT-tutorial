package com.company;

public class CreditCardPayment implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("Paying with credit card with amount of " + amount);
    }
}
