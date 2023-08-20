package com.aditya.cj.day5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DayName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day number :");
        int num = sc.nextInt();
        String dayName="";

        switch (num){
            case 1: dayName="Monday";
                    break;
            case 2:dayName="Tuesday";
                    break;
            case 3:dayName="Wedneseday";
                break;
            case 4:dayName="Thursday";
                break;
            case 5:dayName="Friday";
                break;
            case 6:dayName="Saturday";
                break;
            case 7:dayName="Sunday";
                break;
            default:dayName = "Invalid day";
        }
        System.out.println(num+" => "+dayName);
    }
}
