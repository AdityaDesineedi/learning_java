package com.aditya.cj.day4;

public class PrimeNumberGenerator {
    public static void main(String[] args) {

        int lb=10, ub=50;
        for(int i=lb;i<=ub;i++){
            if(isPrime(i)){
                System.out.println(i+" ");
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
