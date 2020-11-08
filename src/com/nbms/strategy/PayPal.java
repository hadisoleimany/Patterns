package com.nbms.strategy;

public class PayPal implements Payment {
    @Override
    public void pay(String name) {
        System.out.println("PayPal : "+name);
    }
}
