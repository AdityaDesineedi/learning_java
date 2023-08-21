package com.aditya.cj.day15;
class One{
    One(){
        //super(); it will call the super class everytime before executing any further(in this case it is object class)
        System.out.println("one");
    }

}

class Two extends One{
    Two(){
        //super(); it will call the super class everytime before executing any further
        System.out.println("two");
    }

}

class Three extends Two{

    Three(){
        //super(); it will call the super class everytime before executing any further
        System.out.println("three");
    }
}

public class InheritanceManager {
    public static void main(String[] args) {
        Three obj = new Three();
    }
}
