package com.aditya.cj.day18;


interface Calc {
    int add(int a, int b);
    double add(double a, double b);
    default float add(float a, float b){ //Inorder to allow backward compatability they introduced default
        return a+b;
    }
}

class Calculator implements Calc{
    @Override
    public int add(int a, int b) {
        return 0;
    }

    @Override
    public double add(double a, double b) {
        return 0;
    }
}


public class InterfaceExample2 {
}
