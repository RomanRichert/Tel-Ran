package com.company;

public class Main {

    public static void main(String[] args) {
	// 1. Написать метод, выводящий сумму двух переменных целого типа на экран.
        int a=2;
        int b=3;
        int summary=a+b;
        System.out.println("1. a=2, b=3; a+b=" +summary);
	// 2. Написать метод, выводящий результат деления двух переменных целого типа на экран.
        double c=6;
        int d=3;
        double e=c/d;
        System.out.println("2. c=6, d=3; c/d=" +e);
	// 3. Написать метод, выводящий на экран результат возведения переменной типа инт в квадрат-
        int Int=2;
        int qInt=Int*Int;
        System.out.println("3. Int=2; qInt=" +qInt);
	// 4. Пусть цена товара А 1000 евро, товара B 500 евро. Если клиент покупает товары вместе
        // действует скидка 100 евро. Вывести на экран переменную, которая соответствует стоимости
        //товаров A +B со скидкой.
        int A=1000;
        int B=500;
        int discount=-100;
        int sum=A+B+discount;
        System.out.println("4. A = 1000€, B = 500€, discount 100€ if A and B were bought together. Amount of payment = " +sum);
        //5. Вывести на экран площадь и периметр круга используя переменную радиус
        // perimeter=2piR
        // area=piR^2
        double R=5;
        double perimeter=2*3.14*R;
        double area=3.14*R*R;
        System.out.println("5. If the radius of the circle = " +R +" then the perimeter = " +perimeter +", and the area = " +area);
        //6.написать программу  для перевода температуры из градусов фаренгейта в градусы цельсия
        //С=(5*(F-32))/9
        double F=0;
        double C=(5*(F-32))/9;
        System.out.println("6. " +C);
        //7 написать программу, переводящую дюймы в метры. Один дюйм 0,0254 метра
        double inch=31.5;
        double m=inch*0.0254;
        System.out.println("7. " +inch +" дюймов это " +m +" метров");
        //8. вывести на экран среднее арифметическое трех переменных x,y,z
        int x=4;
        int y=5;
        int z=6;
        int average=(x+y+z)/3;
        System.out.println("8. The average of " +x +", "+y +" and " +z +" is " +average);









    }
}
