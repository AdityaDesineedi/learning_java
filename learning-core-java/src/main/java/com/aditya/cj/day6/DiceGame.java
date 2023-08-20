package com.aditya.cj.day6;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class DiceGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rnum = ThreadLocalRandom.current().nextInt(1,7);
        for(int i=1; i<=3;i++) {
            System.out.println("Guess a number from 1-6 :");
            int gnum = sc.nextInt();
            if (rnum == gnum) {
                System.out.println("Good you guessed number in "+i+" attempts");
                break;
            } else {
                System.out.println("Your guess is wrong");
                if(i==3){
                    System.out.println("You have reached max attempts, the number is :"+rnum);
                }
            }
        }
    }
}
