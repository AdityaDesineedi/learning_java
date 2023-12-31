package com.aditya.cj.day14;

import java.util.Scanner;

public class AccountManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AccountService service = new AccountService();
        while (true) {
            System.out.println("1.Create 2.Deposit 3.Withdraw 4.Show Details 5.Show All Accounts 6.Exit");
            int ch = sc.nextInt();
            switch (ch){
                case 1:
                    sc.nextLine();
                    System.out.println("Enter the name :");
                    String name = sc.nextLine();
                    System.out.println("Enter the initial balance :");
                    float balanace = sc.nextFloat();
                    service.createAccount(name,balanace);
                    break;
                case 2:
                    System.out.println("Enter the acc Number :");
                    int accNumber = sc.nextInt();
                    System.out.println("Enter the deposit amount :");
                    float depositAmount = sc.nextFloat();
                    service.deposit(accNumber,depositAmount);
                    break;
                case 3:
                    System.out.println("Enter the acc Number :");
                    int withdrawAccNumber = sc.nextInt();
                    System.out.println("Enter the withdraw amount :");
                    float withdrawAmount = sc.nextFloat();
                    service.withdrawAmount(withdrawAccNumber,withdrawAmount);
                    break;
                case 4:
                    System.out.println("Enter the acc Number :");
                    int displayAccNumber = sc.nextInt();
                    service.showDetails(displayAccNumber);
                    break;
                case 5:
                    service.showAllAccountDetails();
                    break;
                case 6:
                    System.out.println("Thanks for using this service");
                    System.exit(0);
                default:
                    System.out.println("Please enter valid input");
            }
            System.out.println("Do you want to continue? enter 1 to continue");
            int choice = sc.nextInt();
            if(choice!=1){
                break;
            }
        }
    }
}
