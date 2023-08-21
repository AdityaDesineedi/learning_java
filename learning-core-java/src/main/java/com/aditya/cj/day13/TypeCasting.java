package com.aditya.cj.day13;

public class TypeCasting {
    public static void main(String[] args) {
        int a =10;
        float b =a;
        System.out.println(a);
        System.out.println(b);
        //Type casting
        float c= 1005f;
        int d= (int)c;
        System.out.println(c);
        System.out.println(d);

        //Parsing

        String ageStr = "37";
        int age = Integer.parseInt(ageStr);
        System.out.println(age+3);

        //Boxing
        //UnBoxing

        Integer obj = Integer.valueOf(100);
        int value = obj;
        obj = 200;
    }
}
