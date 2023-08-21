package com.aditya.cj.day19;

import com.aditya.cj.day11.one.A;

import java.util.ArrayList;
import java.util.List;

interface MyPredicate{
    boolean test(Integer obj);
}

class AgeAbove50 implements MyPredicate{
    @Override
    public boolean test(Integer age) {
        return age>50;
    }
}

class UserDetails{
    private List<Integer> userAgeList =  List.of(23,18,19,15,14,25,35,45,55,54,26,85);

    public List<Integer> ageBetween(int lb, int ub){
        List<Integer> filteredList = new ArrayList<>();
        for(int age:userAgeList){
            if (age < ub && age>lb) {
                filteredList.add(age);
            }
        }
        return filteredList;
    }
    public List<Integer> ageGte(int age){
        List<Integer> filteredList = new ArrayList<>();
        for(int ele:userAgeList){
            if (ele >=age ) {
                filteredList.add(ele);
            }
        }
        return filteredList;
    }

    public List<Integer> ageFilter(MyPredicate myPredicate){ //passing method implementation
        List<Integer> filteredList = new ArrayList<>();
        for(int ele:userAgeList){
            if (myPredicate.test(ele)){
                filteredList.add(ele);
            }
        }
        return filteredList;
    }
}

interface MathOperations{
    double perform(double a, double b);
}

class Biggest implements MathOperations{
    @Override
    public double perform(double a, double b) {
        return a>b?a:b;
    }
}

public class Manager {
    public static void main(String[] args) {

        UserDetails obj = new UserDetails();
        MyPredicate predicate = new MyPredicate() { //ananymous object
            @Override
            public boolean test(Integer age) {
                return age>30 && age<=50;
            }
        };
        List<Integer> list1 = obj.ageFilter(predicate);
        System.out.println(list1);
        MyPredicate predicate1 =(age)->age>=50; //lambda expression
        List<Integer> list2 = obj.ageFilter(predicate1);
        System.out.println(list2);
        List<Integer> list = obj.ageFilter(new AgeAbove50());
        System.out.println(list);

        Biggest objg = new Biggest();

        MathOperations mathOperations = new MathOperations() { //ananoymous object
            @Override
            public double perform(double a, double b) {
                return a>b?a:b;
            }
        };
        MathOperations add = (num1,num2)->num1>num2?num1:num2; // lambda expression
        System.out.println(add.perform(8,9));
        System.out.println(mathOperations.perform(5,6));
        System.out.println(objg.perform(4,5));
    }
}
