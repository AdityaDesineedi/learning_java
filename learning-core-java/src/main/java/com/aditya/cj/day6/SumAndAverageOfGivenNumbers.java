package com.aditya.cj.day6;

public class SumAndAverageOfGivenNumbers {
    public static void main(String[] args) {
        int[] arr = new int[]{10,20,30,40,50};

        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }

        for(int i= arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }

        //get last three elements
        for(int i=arr.length-3;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        for(int ele:arr){
            System.out.println(ele);
        }

        int sum=0;
        for(int ele:arr){
            sum+=ele;
        }
        System.out.println(sum);

        float avg = sum/(float)arr.length;
        System.out.println(avg);

    }
}
