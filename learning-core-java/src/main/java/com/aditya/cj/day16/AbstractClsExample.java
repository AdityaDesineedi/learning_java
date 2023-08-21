package com.aditya.cj.day16;

abstract class D1{
    abstract void m1();
    void m2(){
        System.out.println("Hello");
    }
    public abstract void m3();
    public abstract void m4();
}

abstract class D2 extends D1{
    @Override
    void m1(){
        System.out.println("m1");
    }
    @Override
    public void m3(){
        System.out.println("m3");
    }
}

class D3 extends D2{

    @Override
    public void m4() {
        System.out.println("m4");
    }
}
public class AbstractClsExample {
}
