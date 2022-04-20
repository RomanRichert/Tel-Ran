package com.company;



public class Main {

    public static void main(String[] args) {

        System.out.println(number(7));
    }
    public static String number (int num) {

        return (num%2==0)? "Чётное число":"Нечётное число";

    }
}
