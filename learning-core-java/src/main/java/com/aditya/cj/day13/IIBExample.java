package com.aditya.cj.day13;

class Parent{
    public Parent(){
        System.out.println("Parent Constructor");
    }
    {
        System.out.println("IIB Parent");
    }
}

class Two extends Parent{
    static{
        System.out.println("Static block-1");
    }
    Two(){
        super();
        //IIB:
        System.out.println("Constructor");
    }
    //Instance Initializer block
    {
        System.out.println("IIB");
    }
    static{
        System.out.println("Static block-2");
    }
}
public class IIBExample {
    public static void main(String[] args) {
        Two obj = new Two();
        Two obj1 = new Two();
    }
}
