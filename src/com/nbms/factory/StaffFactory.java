package com.nbms.factory;

public class StaffFactory {

    private final static String SUPPORT="SUP";
    private final static String TECHNICAL="TEC";
    private final static String SALE="SAL";
    public static Staff getStaff(String code){
        if(code.startsWith(SUPPORT)){
            return new Support();
        }else if(code.startsWith(TECHNICAL)){
            return new Technical();
        }
        else if(code.startsWith(SALE)){
            return new Sale();
        }
        else return null;
    }
}
