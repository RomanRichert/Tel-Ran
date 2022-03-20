package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Задача №3501. Максимум двух чисел
        //Даны два целых числа. Выведите значение наибольшего из них.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        if (a>b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
