package com.aditya.cj.day15;

class A1{
    int a =100;

    void show(){
        //System.out.println(a);
        System.out.println("A1");
    }
}

class A2 extends A1{
    int a = 999;
    void show(){
        //System.out.println(a);
        //System.out.println(super.a);
        super.show();
        System.out.println("A2");
    }
    void display(){
        show();
        super.show();
    }
}

class A3 extends A2{
    void show(){
        System.out.println("A3");
    }
    void display(){
        show();
        super.show();
    }
}

public class QuestionsManager {
    public static void main(String[] args) {
        A3 obj = new A3();
        obj.display();
    }

}
