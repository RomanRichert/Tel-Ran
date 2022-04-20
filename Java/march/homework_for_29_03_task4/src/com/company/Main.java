package com.company;

public class Main {

    public static void main(String[] args) {
	// Given two integers number1 and number2.
        // Implement method that returns the sum of all numbers between number1 and
        // number2 that divisible by 3.
        System.out.println(method(20 , 10));
    }
    public static int method (int number1, int number2) {
        int sum = 0;
        while (number1>=number2) {
            if (number1%3==0) {
                sum = sum + number1;
            }
            number1--;
        }
        return sum;
    }
}
