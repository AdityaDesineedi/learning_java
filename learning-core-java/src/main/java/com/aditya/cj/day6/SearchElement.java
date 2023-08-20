package com.aditya.cj.day6;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class SearchElement {
    public static void main(String[] args) {
        int[] arr = getElements(20);
        System.out.println(Arrays.toString(arr));

        int key =8;
        boolean flag = true;
        for(int ele:arr){
            if(key==ele){
                flag = true;
                break;
            }else{
                flag=false;
            }
        }
        if(flag){
            System.out.println("Key is present");
        }else{
            System.out.println("Key is not present");
        }

        int index = search(arr,key);
        if(index != -1){
            System.out.println("Element "+key+" Present at index "+index);
        }else{
            System.out.println("Element "+key+" is not found");
        }

        int a=4, b=5,c=8;
    }


    public static int search(int[] arr, int key){
        for(int i=0; i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static boolean search(int[] arr, int a, int b, int c){
        return search(arr,a)!=-1 && search(arr,b)!=-1 && search(arr,c) !=-1;
    }

    private static int[] generatePrimeNumbers(int n){
        return null;
    }

    private static int[] generatePrime(int lb, int ub){
        return null;
    }
    public static int smallest(int[] arr){
        int small = arr[0];
        for(int i=1; i<arr.length;i++){
            if(small>arr[i]){
                small=arr[i];
            }
        }
        return small;
    }

    public static int biggest(int[] arr){
        int big = arr[0];
        for(int i=1; i<arr.length;i++){
            if(big<arr[i]){
                big=arr[i];
            }
        }
        return big;
    }

    public static int[] getElements(int n){
        int[] arr =new int[n];

        for(int i=0; i<arr.length;i++){
            arr[i]= ThreadLocalRandom.current().nextInt(1,n+1);
        }
        return arr;
    }
}
