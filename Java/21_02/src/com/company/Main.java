package com.company;

public class Main {

    public static void main(String[] args) {
        // 2.
        int a2=5768;
        int x1=a2/1000;
        int x2=(a2/100)%10;
        int x3=(a2/10)%10;
        int x4=a2%10;
        int sum=x1+x2+x3+x4;
        System.out.println(sum);
        // 4.
        int d=90;
        int h=d*2/60;
        System.out.println(d+" градусов на циферблате это "+h+" часа.");
        // 5.
        int k=1331;
        int k1=k/1000;
        int k2=(k/100)%10;
        int k3=(k/10)%10;
        int k4=k%10;
        int symmetry=(k1+k2)-(k3+k4)+1;
        System.out.println(symmetry+", значит число "+k+" симметрично.");
        // 7.
        int klass1=20;
        int klass2=21;
        int klass3=22;
        int tables=klass1/2+klass1%2+klass2/2+klass2%2+klass3/2+klass3%2;
        System.out.println("Минимальное количество парт: "+tables);
        // Задача №1484.
        //На вход программе подаются два целых числа m и n, по модулю не
        // превосходящие 10^6. Если m делится на n или n делится на m, то
        // требуется вывести 1, в противном случае - любое другое число.
        int n=2;
        int m=8;
        if (n%m==0||m%n==0) {System.out.println(1);} else {
            System.out.println(100);
        }
        // Задача №1485. сравнение чисел
        //На вход программе подаются два целых числа m и n, по модулю не превосходящие 10^6. Если m≥n, то требуется
        // вывести 1, в противном случае - любое другое число.
        if (m>=n) {System.out.println(1);} else {
            System.out.println(100);}



    }
}
