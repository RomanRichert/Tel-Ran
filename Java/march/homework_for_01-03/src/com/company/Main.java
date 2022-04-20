package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1. Imagine you are writing a program for a store. It should announce the promotion condition: ” You can get the
        // BestWowSomething by the price 89.99$. But if you buy two articles then you get the discount 10% of all and if
        // you bay three and more the discount will be 15% of all”. Then It should asks the user how many articles user
        // wants to buy. If the user input something more than 0 the program should print the amount of purchase, else
        // displays “It's a pity. See you next time”

        System.out.println("You can get the BestWowSomething by the price 89.99$. But if you buy two articles then you get the discount 10% of all and if you bay three and more the discount will be 15% of all");
        int articles = sc.nextInt();
        double price = 89.99;
        double discount2 = price*articles*0.1;
        double discount3 = price*articles*0.15;

       if (articles>0) {
           if (articles==1) System.out.println(price+"$");
           if (articles==2 )System.out.println(price*articles-discount2+"$");
           if (articles>2) System.out.println(price*articles-discount3+"$");
       } else {
           System.out.println("It's a pity. See you next time");
       }



    }
}
