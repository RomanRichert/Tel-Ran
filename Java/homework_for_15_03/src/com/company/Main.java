package com.company;

public class Main {

    public static void main(String[] args) {
        //Задача №296. Количество равных из трех
        //Входные данные:
        //Даны три целых числа, записанных в отдельных строках. Определите, сколько среди них совпадающих.
        //Выходные данные:
        //Программа должна вывести одно из чисел: 3 (если все совпадают), 2 (если два совпадают) или 0 (если все числа различны).
        int a=1;
        int b=2;
        int c=2;
        if(a == b && b == c && a == c) {
            System.out.println(3);
        }
        else if(a == b || a == c || b == c) {
            System.out.println(2);
        }
        else
            System.out.println(0);

        //Написать программу, определяющую в какой координатной четверти находиться точка.
                //Пример (1, 2) Ответ первая
        int x = 1;
        int y = 2;

        if (x >0 && y >0) {
            System.out.println("первая" );
        }
        if (x <0 && y >0) {
            System.out.println("вторая");

        }
        if (x <0 && y <0) {
            System.out.println("третья");
        }
        if (x >0 && y <0) {
            System.out.println("четвёртая");
        }


    }
}
