package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Задача №3516. Линейное уравнение
        //Даны числа a и b. Решите в целых числах уравнение ax+b=0. Выведите все решения этого уравнения,
        // если их число конечно, выведите слово NO, если решений нет, выведите слово INF, если решений бесконечно много.
        Scanner sc = new Scanner(System.in);
        System.out.println("ax+b=0");
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        if (a==0) {
            System.out.println("INF");
            return;
        }
        int x = -b/a;

        if (b%a!=0) {
            System.out.println("NO");
        } else {
            System.out.println(x);
        }

    }
}
