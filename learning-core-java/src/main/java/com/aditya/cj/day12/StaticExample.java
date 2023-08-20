package com.aditya.cj.day12;
import static java.lang.Math.*;
import static java.lang.System.*;


class RandomData{
    public static double pow(double a, double b){
        double res=a;
        for(int i=1;i<b;i++){
            res*=a;
        }
        return res;
    }
}
public class StaticExample {
    public static void main(String[] args) {
        out.println(sqrt(10));
        out.println(Math.pow(2,3));
        out.println(RandomData.pow(2,3));
        out.println(PI);
    }
}
