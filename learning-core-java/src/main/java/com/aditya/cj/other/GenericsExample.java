package com.aditya.cj.other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Container<T extends Number>{

    Object[] arr = new Object[3];
    int count =0;
    public void add(T ele){
        arr[count++] =ele;
    }
    public T get(int index){
        if(index>=0 && index <count){
            return (T) arr[index];
        }
        throw new IndexOutOfBoundsException("Please check index");
    }
    public T[] getElements(){
        Object[] tmp = new Object[count];
        System.arraycopy(arr,0,tmp,0,count);
        return (T[]) tmp;

    }
}

public class GenericsExample {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add(1);
        list.add("hello");
        list.add(true); //you can add any type but while retreving you need to type cast everything

        for(Object ele:list){
            if(ele instanceof String e){
                System.out.println(e.toUpperCase());
            }
        }

        List<String> list1 = new ArrayList<>(); //it creates a list of string , it won't allow other type values
        for(String ele:list1){
                System.out.println(ele.toUpperCase());
        }

        Container<String> container = new Container<>();
        container.add("Krish");
        container.add("Manoj");
        container.add("Charan");

        System.out.println(Arrays.toString(container.getElements()));

        Container<Integer> container1 = new Container<>();
        container1.add(1);
        container1.add(2);
        container1.add(3);

        System.out.println(Arrays.toString(container1.getElements()));
    }
}
