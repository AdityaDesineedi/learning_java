package com.aditya.cj.day16;
class C1{
    public void m1(){
        System.out.println("m1");
    }
}

class C2 extends C1{
    public void m2(){
        System.out.println("m2");
    }
}

public class Manager {
    public static void main(String[] args) {
        C1 obj = new C1();
        obj.m1();
        if(obj instanceof C2 ref){
           ref.m2();
           ref.m1();
        }
    }
}
