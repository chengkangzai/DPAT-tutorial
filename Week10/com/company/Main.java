package com.company;

public class Main {

    public static void main(String[] args) {
        var user = new User();
        user.pay(100, new CreditCardPayment());
        user.pay(100, new OnlinePayment());
        user.pay(100, new PaypalPayment());

        //What is the difference between Strategy and State?
        //Strategy  --> allows an algorithm to be swapped out
        //State     --> allows an object to change its behavior
    }
}
