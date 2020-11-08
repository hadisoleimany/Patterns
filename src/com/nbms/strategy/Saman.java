package com.nbms.strategy;

public class Saman implements Payment {
    @Override
    public void pay(String name) {
        System.out.println("Saman : "+name);
    }
}
