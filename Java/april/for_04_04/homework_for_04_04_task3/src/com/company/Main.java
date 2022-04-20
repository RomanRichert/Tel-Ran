package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Задача №113. Список квадратов
        //Выведите все точные квадраты натуральных чисел, не превосходящие данного числа N.
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = sc.nextInt();
        int i = 1;
        if (n>0) {
            while (i*i<=n) {
            System.out.println(i*i);
            i++;
            }
        }
        sc.close();
    }
}
