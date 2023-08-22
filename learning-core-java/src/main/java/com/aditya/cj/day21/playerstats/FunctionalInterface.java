package com.aditya.cj.day21.playerstats;

import java.util.function.Predicate;


public class FunctionalInterface {
    public static void main(String[] args) {

        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return false;
            }
        }
    }
}
