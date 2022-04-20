package com.company;

public class Main {

    public static void main(String[] args) {
        /*Implement a method that prints the given String N times.
        printLineNtimes(“hello”,3) -> hello
                hello
        hello*/
	System.out.println(method(3));
    }
    public static String method (int n) {
        String hello = "hello\n";
        return hello.repeat(n);
    }
}
