package com.aditya.cj.day18;
//to be a functional interface it need to have only one abstract method

import com.aditya.cj.day4.BreakStatement;

import java.util.List;

@FunctionalInterface
interface I1{ //It is not a functional interface because it got two abstract methods
    void m1();//It is a Functional interface
    default void m2(){

    }
    private void m3(){

    }
    private static void m4(){

    }
}

//An interface without any body or methods is called marker interface eg: cloneable and serializable
interface I2{
    double perform(double a, double b);

}
class C1 implements I2{
    @Override
    public double perform(double a, double b) {
        return a+b;
    }
}

class C2 implements I2{
    @Override
    public double perform(double a, double b) {
        return a*b;
    }
}


class MathOperation{
    public double result(List<Integer> list, I2 obj){
        double res= list.get(0);
        for(int i=1;i<list.size();i++){
            res = obj.perform(res, list.get(i));
        }
        return res;
    }
}

public class InterfaceExample4 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6);

        MathOperation obj = new MathOperation();
       // double res =obj.result(list,new C2());
        double res =obj.result(list,(a,b)->a<b?a:b); //Lambda expression
        System.out.println(res);
    }
}
