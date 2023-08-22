package com.aditya.cj.day21;

import com.aditya.cj.day11.one.A;

import java.util.ArrayList;
import java.util.List;

public class ListExample1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1001);
        list.add(1002);
        list.add(1003);
        list.add(1010);
        list.add(1203);

        System.out.println(list.get(2));
        System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        for(int ele:list){
            System.out.println(ele);
        }
    }

}
