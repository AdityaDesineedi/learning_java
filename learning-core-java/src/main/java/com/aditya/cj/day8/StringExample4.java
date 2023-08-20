package com.aditya.cj.day8;

public class StringExample4 {
    public static void main(String[] args) {
        String name = "wow";

        if(isPalindrome(name)){
            System.out.println("It is a palindrome");
        }
        else {
            System.out.println("It is not a palindrome");
        }

        String data = "Krish, Manoj, rajesh, jayesh, suresh";
        String[] arr = data.split(",");
        System.out.println(arr);
        for(String name1:arr){
            name1 = name1.trim();
            System.out.println(name1.substring(0,1).toUpperCase().concat(name1.substring(1)));
        }
    }

    private static boolean isPalindrome(String str){
        //int l= str.length();

        //for(int i=0,j=l-1;i<=j;i++,j--){
            //if(str.charAt(i)!=str.charAt(j)){
                //return false;
            //}
        //}
        //return true;
        return new StringBuilder(str).reverse().toString().equals(str);
    }

    private static int countVowels(String str){
        return 0;
    }
}
