package com.nbms;

public class Main {
    public static void main(String[] strings)
    {
        PaymentChanel chanel=new PaymentChanel();


        chanel.setName("Now");

        chanel.showChanel(new MasterCard());
        chanel.showChanel(new Saman());
        chanel.showChanel(new PayPal());
    }

}
