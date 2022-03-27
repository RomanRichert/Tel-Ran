package com.company;

public class Main {

    public static void main(String[] args) {
	// Given two integers number1 and number2.
        // Implement method that printы all numbers between number1 and number2 that divisible by 3.
        System.out.println(method(10 , 20));

    }
    public static String method (int number1, int number2) {
        while (number1<=number2) {
            if (number1%3==0) {
                System.out.println(number1);
            }
            number1++;
        }
        return "";
    }
}
