package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getMinimum(5, 6, 1));
    }
    public static int getMinimum(int a, int b, int c){
    if ((a<b)&&(a<c))
        return a;

    else if ((b<a)&&(b<c))
        return b;

    else
        return c;


    }

}
