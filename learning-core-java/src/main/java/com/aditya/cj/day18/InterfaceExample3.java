package com.aditya.cj.day18;

import com.aditya.cj.day11.one.A;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.pow;

interface NumberOperations{

    public static double power(int n, int m){
        double res =1;
        for(int i=1; i<=m;i++){
            res*=n;
        }
        return res;
    }

    private static double pow(int a, int b){
        return pow(a,b);
    }
    boolean isPrime(int num);
    default List<Integer> primeInRange(int lb, int ub){
        List<Integer> list =new ArrayList<>();
        for(int i=lb;i<=ub;i++){
            if(isPrime(i)){
                list.add(i);
            }
        }
        return list;
    }
    default int primeCount(int lb, int ub){
        return primeInRange(lb,ub).size();
    }
    default List<Integer> prime(int n){
        return getPrimes(n);

    }

    private List<Integer> getPrimes(int n){
        List<Integer> list = new ArrayList<>();
        int i=2;
        while(list.size()!=n){
            if(isPrime(i)){
                list.add(i);
            }
            i++;
        }
        return list;
    }
}

class NumberOperationsImpl implements NumberOperations{
    @Override
    public boolean isPrime(int num) {
        if(num<2 || (num%2==0 && num!=2)){
            return false;
        }
        for(int i=2;i<=num/2;i++){
            if(num%i ==0){
                return false;
            }
        }
        return true;
    }
}

public class InterfaceExample3 {
    public static void main(String[] args) {
        NumberOperations obj =new NumberOperationsImpl();

    }

}
