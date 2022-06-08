package com.company;

public class Grocery extends Product {

    public Grocery(String name, double price) {
        super(name, price);
    }

    public void buy(int amount){
        super.buy(amount);
        System.out.println("Delivery             4.99 Euro");
        System.out.println("TO PAY:              "+(amount*getPrice()+4.99)+" Euro");
    }
}
