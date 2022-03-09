package com.company;

public class Main {

    public static void main(String[] args) {
	//1. Вася спит днём, если он не работает или у него отпуск.
        // переменная weekday=true если это рабочий день. переменная vacation=true,
        //если у него отпуск. Напишите выражение равное true, если Вася спит.
        // isSleeping=true если weekday and vacation are both false.

        boolean weekday=true;
        boolean isSleeping=!weekday;
        System.out.println(isSleeping);

        // 2. Воспитательница знает, если Петя и Вася оба смеются, или оба серьёзные,
        // то они что-то затевают. Написать выражение, где они что-то затевают.
        boolean petyaLaugh=true;
        boolean vasyaLaugh=true;
        boolean warning=(petyaLaugh&&vasyaLaugh)||(!petyaLaugh&&!vasyaLaugh);
        System.out.println(warning);


    }
}
