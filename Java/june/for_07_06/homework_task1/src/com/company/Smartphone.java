package com.company;

public class Smartphone extends Elecronics {
    String color;
    double contractPrice;
    public Smartphone(String maker, String name, String color, double price, double contractPrice) {
        super(name, maker, price);
        this.color = color;
        this.contractPrice = contractPrice;
    }
    @Override
    public void buy(int amount) {
        header();
        System.out.println("01 "+getName());
        System.out.println("               "+amount+" X   "+getPrice()+" = "+amount*getPrice());
        System.out.println("02 contract");
        System.out.println("               "+amount+" X   "+contractPrice+" = "+amount*contractPrice);
        System.out.println();
        System.out.println("Smartphone+contract discount = 70%");
        System.out.println();
        System.out.println("TO PAY:                "+(amount*(getPrice()-(getPrice()*70/100)+contractPrice))+" Euro");
        System.out.println("               Monthly: "+amount*contractPrice+" Euro");
        System.out.println();
        footer();
        addGuarantee(amount);

        
    }

}
