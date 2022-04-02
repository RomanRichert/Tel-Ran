package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//Задача №112205. Квадраты
        //Напишите программу, которая вводит натуральные числа a и b ,
        // и выводит квадраты натуральных чисел в диапазоне [ a , b ] .
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите a: ");
        int a = sc.nextInt();
        System.out.println("Введите b: ");
        int b = sc.nextInt();
        int i=a;
        if (a>0 && b>a) {
            while (i<=b) {
                System.out.println(i+"² = "+i*i);
                i++;
            }

        } else if (b>0 && b<a) { // а если б я читал задание целиком сразу, то мог бы и не писать эту часть...
            i=b;
            while (i<=a) {
                System.out.println(i+"² = "+i*i);
                i++;
            }
        }
        sc.close();
    }
}
