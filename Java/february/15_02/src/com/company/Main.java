package com.company;

public class Main {

    public static void main(String[] args) {
	String str1="Hello";
	String str2="Java";
    int a=10;
    double b=-7;


    var md=1;
    boolean bool1=true;
    System.out.println(bool1);
    boolean bool2=false;
    System.out.println(bool2);
    boolean bool3=10>9;
        System.out.println("Значение bool3 = " +bool3);
        boolean bool4=10<=10;
        System.out.println("Значение bool4 = " +bool4);
        boolean bool5=10==9; //логически равно
        System.out.println("Значение bool5 = " +bool5);
        boolean bool6=10!=9; //не равно
        System.out.println("Значение bool6 = " +bool6);
        b=78;
                boolean bool7=a>b;
        System.out.println("Значение bool7 = " +bool7);
        boolean bool8=str1==str2;
        System.out.println("Значение bool8 = " +bool8);
  // ------------------------------------------------------------------------------------------
        int d=11;
        boolean result=(d%2)==0;
        System.out.println(d+" это чётное число: "+result);
        //..........................................................................................
        boolean bool10=(a>3)&&(a<5);
        System.out.println("a="+a);
        System.out.println(bool10);


    }
}
