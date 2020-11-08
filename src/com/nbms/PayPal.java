package com.nbms;

public class PayPal implements Payment {
    @Override
    public void pay(String name) {
        System.out.println("PayPal : "+name);
    }
}
