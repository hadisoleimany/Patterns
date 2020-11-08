package com.nbms.factory;

public class Main {
    public static void main(String[] args){
        Staff sale = StaffFactory.getStaff("SAL-2321");
        Staff support = StaffFactory.getStaff("SUP-2349");
        Staff technical = StaffFactory.getStaff("TEC-7984");

        System.out.println(sale);
        System.out.println(support);
        System.out.println(technical);

    }

}
