package com.nbms.strategy;

public class MasterCard implements Payment {
    @Override
    public void pay(String name) {
        System.out.println("Master Card : "+name);
    }
}
