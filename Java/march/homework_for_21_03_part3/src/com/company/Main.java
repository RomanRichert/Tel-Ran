package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//Задача №3519. Тип треугольника
        //Даны три стороны треугольника a, b, c. Определите тип треугольника с заданными сторонами.
        // Выведите одно из четырех слов: rectangular для прямоугольного треугольника, acute для остроугольного
        // треугольника, obtuse для тупоугольного треугольника или impossible, если треугольника с такими сторонами не существует.
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.println("Enter a: ");
        a = sc.nextDouble();
        System.out.println("Enter b: ");
        b = sc.nextDouble();
        System.out.println("Enter c: ");
        c = sc.nextDouble();
        if ((a+b<=c)||(a+c<= b)||(c+b<=a)||(a+b+c<= 0)) {
            System.out.println("impossible");
        } else {
        if (((c>a)&&(c>b)&&(a*a+b*b-c*c>0))||((b>a)&&(b>c)&&(a*a+c*c-b*b>0))||((a>b)&&(a>c)&&(b*b+c*c-a*a>0))) {
        System.out.println("acute");
        }
        if (((c>a)&&(c>b)&&(a*a+b*b-c*c<0))||((b>a)&&(b>c)&&(a*a+c*c-b*b<0))||((a>b)&&(a>c)&&(b*b+c*c-a*a<0))) {
            System.out.println("obtuse");
        }
        if (((c>a)&&(c>b)&&(a*a+b*b-c*c==0))||((b>a)&&(b>c)&&(a*a+c*c-b*b==0))||((a>b)&&(a>c)&&(b*b+c*c-a*a==0))) {
            System.out.println("rectangular");
        }
        }


    }
}
