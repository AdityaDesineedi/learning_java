package com.aditya.cj.day12;

public class StaticBlock {

    static{
        System.out.println("one");
    }

    public static void main(String[] args) {
        System.out.println("Main method");
    }

    static{
        System.out.println("Two");
    }
}
