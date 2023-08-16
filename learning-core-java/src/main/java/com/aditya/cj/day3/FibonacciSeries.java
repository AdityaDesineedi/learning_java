package com.aditya.cj.day3;

import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value:");
        int n = sc.nextInt();

        //int a=0;
        //int b=1;
      /*  for(;a<=n;){
            System.out.println(a+" ");
            int sum = a+b;
            a=b;
            b=sum;
        }*/
        BigInteger a = BigInteger.valueOf(0);
        BigInteger b = BigInteger.valueOf(1);
        for(int i=1;i<=n;i++){
            System.out.println(a+" ");
            BigInteger sum = a.add(b);
            a=b;
            b=sum;
        }
    }
}
