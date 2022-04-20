package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // 1.
	int n1 = 150;
    int hours1 = n1%(60*24) / 60;
    int minutes1 = n1%60;
    System.out.println(hours1+":"+minutes1);
    // 3.
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        if (num<0) {
            num = -1*num;
        }
        System.out.println(num);


    }
}
