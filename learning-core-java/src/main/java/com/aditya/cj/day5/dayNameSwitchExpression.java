package com.aditya.cj.day5;

import java.util.Scanner;

public class dayNameSwitchExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day number :");
        int num = sc.nextInt();


        String dayName = switch (num){
            case 1 -> {yield "Monday";}
            case 2 -> "Tuesday";
            case 3 -> "Wedneseday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day";
        };
        System.out.println(num+" => "+dayName);
    }
}
