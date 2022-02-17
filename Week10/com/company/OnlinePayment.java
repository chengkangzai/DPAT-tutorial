package com.company;

public class OnlinePayment implements Payment {
    public void pay(int amount) {
        System.out.println("Paying online with amount of " + amount);
    }
}
