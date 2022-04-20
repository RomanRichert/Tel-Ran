package com.company;

public class Main {

    public static void main(String[] args) {
	// Implement method “countdown” that prints numbers from 5 to 1, than prints „start“
        //countdown() -> 5
        System.out.println(method(6));
    }
    public static String method (int x) {

        while (x>=2) {
            x--;
            System.out.println(x);
        }
        return "Start";
    }
}
