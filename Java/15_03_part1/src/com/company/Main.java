package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of month:");
        int month = sc.nextInt();
        System.out.println(getMonth(month));
    }
    public static String getMonth (int month) {
        String monthName = "";
        switch (month) {
            case 12:
            case 1:
            case 2: monthName = "Winter"; break;
            case 3:
            case 4:
            case 5: monthName = "Spring"; break;
            case 6:
            case 7:
            case 8: monthName = "Summer"; break;
            case 9:
            case 10:
            case 11: monthName = "Autumn"; break;
            default: monthName = "Invalid number";

        }
        return monthName;
    }
}
