package com.nbms.strategy;

public class PaymentChanel {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void showChanel(Payment payment){
        payment.pay(this.name);
    }
}
