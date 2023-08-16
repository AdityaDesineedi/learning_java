package com.aditya.cj.day4;

public class BreakStatement {
    public static void main(String[] args) {
        int n=10;
        int count=0;
        for(int i =2;;i++){
            if (isPrime(i)) {
                System.out.println(i+" ");
                count++;
            }
            if(count ==n){
                break;
            }
        }

    }
    public static boolean isPrime(int num){
        if(num<2 || (num%2==0 && num!=2)){
            return false;
        }
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
