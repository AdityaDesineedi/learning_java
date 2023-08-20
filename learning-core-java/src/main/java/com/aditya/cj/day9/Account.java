package com.aditya.cj.day9;

import java.time.LocalDateTime;

public class Account {
    String accNum;
    String name;
    double balance;
    String sci;

    public Account(String accNum, String name, double balance){
        this.accNum= accNum;
        this.name = name;
        this.balance=balance;
    }

    public Account(String accNum, String name, double balance,String sci){
        this(accNum,name ,balance);
        this.sci = sci;
    }

    public void deposit(double amount){
        balance+=amount;
        //formatting the string
        String message = String.format("Hi %s name, your account %s is credited with amount %s and balance is %s",name,maskAccNumber(accNum),amount,balance);
        System.out.println(message);
    }
    public void withdraw(double amount){
        if(balance>amount){
            balance-=amount;
            System.out.println("Hi "+name+", your account "+accNum+" is debited with amount "+amount+" on "+ LocalDateTime.now());
        }else{
            System.out.println("Insufficent funds :"+balance);
        }
    }



    public void showDetails(){
        System.out.println("Account number:"+ maskAccNumber(accNum));
        System.out.println("Name :"+ name);
        System.out.println("Balance :"+ balance);
    }

    private String maskAccNumber(String accNum){
        if(accNum!=null && accNum.length()>4){
            return "************"+accNum.substring(accNum.length()-4);
        }
        return accNum;
    }
}
