package com.company;

public class Main {

    public static void main(String[] args) {
	// 1. Write a program that gets the speed km / h and returns the speed m / s
        //For example: 10km/h = 10 * (1000/3600) m/s = 2,7777
        double kmh=10;
        double ms=kmh*1000/3600;
        System.out.println("1. " +kmh +" km/h = " +ms +" m/s.");
        // 2. Write a program that print the price of something with tax. You have the price without tax and you know that tax is 19%. The program should print price with the tax.
        //For example: price: 100 tax:19 result: 119
        double price=100;
        double tax=0.19;
        double total=price*tax+price;
        System.out.println("2. Price without taxes: " +price);
        System.out.println("   Total: " +total);

    }
}
