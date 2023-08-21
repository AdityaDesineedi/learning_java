package com.aditya.cj.day16;

public class TypeCastingExample {
    public static void main(String[] args) {
        Object[] arr = new Object[]{123,"Hi","Hello","John","Mahesh",343,"Suresh"};

        for(Object obj:arr){
            if(obj instanceof String name) {
                //String name = (String) obj; //super class obj cannot be type casted
                System.out.println(name.toUpperCase());
            }
        }
    }
}
