package com.aditya.cj.day14;

public class AccNumberGenerator {
    private static int startNumber =1001;
    public static int getAccountNumber(){
        return startNumber++;
    }
}
