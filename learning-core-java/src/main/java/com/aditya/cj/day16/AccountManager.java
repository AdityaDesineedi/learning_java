package com.aditya.cj.day16;

public class AccountManager {

    public static void main(String[] args) {

        Account[] arr = getAccounts();

        int ccount=0;
        int scount =0;
        for(Account acc:arr){
            if(acc instanceof CurrentAccount){
                CurrentAccount obj =(CurrentAccount) acc;
                obj.showMoreDetails();
            }else if(acc instanceof SavingAccount){
                SavingAccount obj = (SavingAccount) acc;
                obj.showDetails();
            }
        }
        System.out.println(ccount+" "+scount);

    }

    public static Account[] getAccounts(){
        SavingAccount acc1 = new SavingAccount(1001L,"Krish",3000,500);
        SavingAccount acc2 = new SavingAccount(1002L,"Manoj",3000,500);
        SavingAccount acc3 = new SavingAccount(1003L,"Charan",3000,500);
        SavingAccount acc4 = new SavingAccount(1004L,"Rajesh",3000,500);

        CurrentAccount acc5 = new CurrentAccount(9901L,"XYZ.com",60000,10000);
        CurrentAccount acc6 = new CurrentAccount(9902L,"XYZ.com",70000,10000);
        CurrentAccount acc7 = new CurrentAccount(9903L,"XYZ.com",80000,10000);
        return new Account[]{acc1,acc2,acc5,acc3,acc6,acc7,acc4};
    }

}
