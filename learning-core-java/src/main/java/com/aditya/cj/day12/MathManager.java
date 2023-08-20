package com.aditya.cj.day12;


class MyMath{
    private MyMath(){

    }

    public static int biggest(int a, int b){
        return a>b?a:b;
    }
}
public class MathManager {
    public static void main(String[] args) {
        int big = MyMath.biggest(3,4);
        System.out.println(big);
    }
}
