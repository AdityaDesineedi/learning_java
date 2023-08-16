package com.aditya.cj.day2;

import java.util.Scanner;

public class BillAmountExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bill amount:");
        float billAmount = sc.nextFloat();
        float discount = 0.0f;
        float netAmount = 0.0f;
        if(billAmount>=10000){
            discount = billAmount*0.1f;
        }
        netAmount = billAmount-discount;
        System.out.println("Bill Amount :"+ billAmount);
        System.out.println("Discounted Amount :"+ netAmount);
    }
}
