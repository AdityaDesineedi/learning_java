package com.aditya.cj.day21;

import com.aditya.cj.day11.one.A;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Consumer;

public class ListExample2 {
    public static void main(String[] args) {
        //Generate 20 random numbers, store in container object and display them

        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=20;i++){
            int num = ThreadLocalRandom.current().nextInt(100,999);
            list.add(num);
        }
        System.out.println("By using for :");
        for(int i=0; i<list.size();i++){
            int ele = list.get(i);
            System.out.println(ele);
        }

        System.out.println("By using for-each :");
        for(Integer ele:list){
            System.out.println(ele);
        }

        System.out.println("By using iterator");

        Iterator<Integer> iterator = list.iterator(); //removes value in underlying elements in list
        System.out.println(list);
        while(iterator.hasNext()){
            int num = iterator.next();
            if(num %2 ==0){
                iterator.remove();
            }
        }
        System.out.println(list);

        System.out.println("By using Listiterator");

        ListIterator<Integer> listItr = list.listIterator(); //removes value in underlying elements in list
        System.out.println(list);
        while(listItr.hasNext()){
            int num = listItr.next();
            if(num %2 ==0){
                listItr.remove();
                listItr.set(num+1);
            }
        }
        while(listItr.hasPrevious()){ //We can traverse in both directions in ListIterator
            int num = listItr.previous();
            if(num %2 ==0){
                listItr.remove();
            }
        }
        System.out.println(list);

        //retrive element from underlying collection
        System.out.println("Consumer interface");
        list.forEach(ele->System.out.print(ele));
    }
}
