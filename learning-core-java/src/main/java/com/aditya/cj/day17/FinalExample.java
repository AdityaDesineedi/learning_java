package com.aditya.cj.day17;

final class One{
    void m1(){

    }
    void m2(){}
}

class Two{

}

class T1{
    void m1(){

    }
    final void m2(){

    }
}

class Person{
    final int age;

    Person(){
        age = 10;
    }
    Person(int age){
        this.age = age;
    }
}

class T2 extends T1{
    @Override
    void m1() {
        System.out.println("T2 M1");
    }
    //void m2(){ you cannot override a final method or extend a final class
        //System.out.println("T2 M2");
    //}
    //when you declare final variables inside a class, ensure that the variable is initialized before execution
}
public class FinalExample {
    public static void main(String[] args) {
        final int DAYS_IN_WEEK = 7;

    }
}
