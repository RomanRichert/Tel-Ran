package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Задача №112204. Первые N чётных
        //Напишите программу, которая вводит натуральное число N и выводит первые N чётных натуральных чисел.
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = sc.nextInt();
        int i = 1;
        if (n>0) {
            while (i <= n) {
                if (i % 2 == 0) {
                    System.out.println(i);
                    i++;
                } else {
                    i++;
                }

            }
        }
        sc.close();

    }
}
