package com.company;

public class Main {

    public static void main(String[] args) {
        method(10,10);
    }
    public static String method(int a, int b) {
        int x=1;
        while (x<=a){
            int y=1;
            while (y<=b) {
                switch (x){
                    case 2: y++; b=20; break;
                    case 3: y=y+2; b=30; break;
                    case 4: y=y+3; b=40; break;
                    case 5: y=y+4; b=50; break;
                    case 6: y=y+5; b=60; break;
                    case 7: y=y+6; b=70; break;
                    case 8: y=y+7; b=80; break;
                    case 9: y=y+8; b=90; break;
                    case 10: y=y+9; b=100; break;
                }
                System.out.print( ((y>0 && y<10)?"0":"")+y+" " );
                y++;
            }
            System.out.println();
            x++;
        }
        return "";
    }
}