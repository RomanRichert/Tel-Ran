package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month;
        int day;
        int year;
        System.out.println("Enter your day:");
        day = sc.nextInt();
        System.out.println("Enter your month:");
        month = sc.nextInt();
        System.out.println("Enter your year:");
        year = sc.nextInt();
        System.out.print(day+"."+month+"."+year+": ");


        boolean isTrueDate = true;
        if(month > 12)
        {
            isTrueDate = false;
        }
        else if (month == 1 || month == 3 || month == 5 || month ==  7 || month ==  8 || month ==  10 || month == 12)
        {
            if (day <= 31)
            {
                isTrueDate = true;
            }
            else
            {
                isTrueDate = false;
            }
        }
        else if (month == 4 || month == 6 || month == 9 || month == 11)
        {
            if (day <= 30)
            {
                isTrueDate = true;
            }
            else
            {
                isTrueDate = false;
            }

        }
        else if (month == 2)
        {
            if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0)))
            {
                if (day <= 29)
                {
                    isTrueDate = true;
                }
                else
                {
                    isTrueDate = false;
                }
            } else {
                isTrueDate = false;
            }

        }
        if(isTrueDate)
        {
            System.out.println("Valid date");
        }
        if(!isTrueDate)
        {
            System.out.println("Invalid date");
        }
    }
}