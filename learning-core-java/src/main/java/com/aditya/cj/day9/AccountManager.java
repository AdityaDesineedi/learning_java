package com.aditya.cj.day9;

import java.util.List;

public class AccountManager {
    public static void main(String[] args) {
        Account acc1 = new Account("1001245454785","sai",2000);
        Account acc2 = new Account("1002584727825","surya",1000);
        Account acc3 = new Account("10038525963863","aditya",3000);

        List<Account> list = List.of(acc1,acc2,acc3);

        double totalBalance = 0;

        for(Account acc:list){
            totalBalance+=acc.balance;
        }
        System.out.println("Total Balance :"+totalBalance);
        //Display max balance customer details

        double maxAmount = list.get(0).balance;
        for(Account acc:list){
            if(maxAmount< acc.balance){
                maxAmount= acc.balance;
            }
        }
        System.out.println("Max balance customer details: (max amount is "+maxAmount+")");
        for(Account acc:list){
            if(acc.balance==maxAmount){
                acc.showDetails();
                System.out.println("-".repeat(50));
            }
        }
    }
}
