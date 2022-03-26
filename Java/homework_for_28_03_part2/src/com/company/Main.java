package com.company;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n1 = sc.nextInt();
        int n = 1;
        int sum=0;
        while (n<=n1) {
            sum = sum +n;
            n++;
        }
        System.out.println(sum);
    }
}
