package com.aditya.cj.day9;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ProductManager {
    //create 10 products store in container
    //if price is more 5000 apply discount 10% show all products
    // Get max priced products
    // Show product in sorting order based on price
    public static void main(String[] args) {
        List<Product> products = getProducts();
        for(Product product:products){
            product.showDetails();
        }

    }

    private static List<Product> getProducts(){
        List<Product> list = new ArrayList<>();
        for(int i=1; i<=10;i++){
            int id = ThreadLocalRandom.current().nextInt(1000,1100);
            String pname= "Product_"+id;
            double price = ThreadLocalRandom.current().nextDouble(5000,50000);
            Product product = new Product(id,pname,price);
            list.add(product);
        }
        return list;

    }

    private static void applyDiscount(List<Product> list,int percentage){

    }
    private static double maxPrice(List<Product> list){
        double max = list.get(0).getPrice();
        for(int i=1;i<list.size();i++){
            double price = list.get(i).getPrice();
            if(max<price){
                max=price;
            }
        }
        return max;

    }
    private static List<Product> maxPricedProducts(List<Product> list){
        List<Product> maxPriceProductList = new ArrayList<>();
        double max = maxPrice(list);
        for(Product p: list){
            if(p.getPrice()==max){
                maxPriceProductList.add(p);
            }
        }
        return maxPriceProductList;

    }
    private static void sortByPrice(List<Product> list){

    }
}
