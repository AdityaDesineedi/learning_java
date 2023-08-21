package com.aditya.cj.day19;

import java.util.List;

class Outer{
    private static List<String> list = List.of("Krish","Manoj","Charan","Mahesh");
    //Inner class can access the private variables of outer class
    //if it is a static class you cannot access the private variables
    //if the variable also static then you can access
    static class Inner{
        void show(){
            for(String ele:list){
                System.out.println(ele);
            }
        }
    }
}

interface Operations{
    double perform(double a,double b);
}

class Add implements Operations{
    @Override
    public double perform(double a, double b) {
        return a+b;
    }
}

class Mul implements Operations{
    @Override
    public double perform(double a, double b) {
        return a*b;
    }
}

public class InnerClassManager {
    public static void main(String[] args) {
        //create a outer class method and then create a inner class method
        //Outer.Inner inner = new Outer().new Inner();
        //if it is a static inner class
        Outer.Inner inner = new Outer.Inner();
        inner.show();

        //Operations obj = new Mul();
        Operations obj = new Operations() { //anonymous object creation
            @Override
            public double perform(double a, double b) {
                return a*b;
            }
        };
        System.out.println(obj.perform(4,5));
        Operations obj1 = (a,b)->a+b;  //Lambda expression (it is only used when it is a functional interface)
        System.out.println(obj1.perform(4,6));
    }
}
