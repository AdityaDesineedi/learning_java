package com.aditya.cj.day17;


class Product{
    private final int id;
    private final String name;
    private final double price;
    private final double discount;

    public Product(int id, String name, double price, double discount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public Product changePrice(double newPrice){
        //we are creating the new object with new price but not updating the old object because the price is final
        return new Product(id,name,newPrice,discount);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                '}';
    }
}
public class ImmutableClass {
    public static void main(String[] args) {
        Product p =new Product(1,"iPhone",45000,10);
        Product newp = p.changePrice(95000); //newp will have the updated value because it created a new object with same values
        System.out.println(p+"_".repeat(50));
        System.out.println(newp);
    }
}
