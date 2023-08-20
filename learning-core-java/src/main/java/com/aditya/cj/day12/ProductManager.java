package com.aditya.cj.day12;


import java.util.concurrent.ThreadLocalRandom;

class Product{
    private int pid;
    private String name;
    private double price;
    private static int count =0;

    public Product(int pid, String name, double price) {
        this.pid = pid;
        this.name = name;
        this.price = price;
        count++;
    }

    public static int getCount(){
        return count;
    }
}
public class ProductManager {

    public static void main(String[] args) {
        System.out.println(Product.getCount());

        for(int i=1;i< ThreadLocalRandom.current().nextInt(1,11);i++){
            Product product = new Product(i,"Product_"+i,i*3000);
        }
        System.out.println(Product.getCount());
    }
}
