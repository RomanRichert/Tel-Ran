package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a1 = sc.nextInt();
        int a = a1;
        System.out.println("Enter b: ");
        int b1 = sc.nextInt();
        int b;
        if (b1>0) {
            b = 2;
            while (b <= b1) {
                a = a + a1;
                b++;
            }
            System.out.println("Answer: "+ a);
        } else if (b1<0) {
            b = -2;
            while (b >= b1) {
                a = a + a1;
                b--;
            }
            System.out.println("Answer: "+ -a);
        } else {
            a=0;
            System.out.println("Answer: "+ a);
        }
    }
}
