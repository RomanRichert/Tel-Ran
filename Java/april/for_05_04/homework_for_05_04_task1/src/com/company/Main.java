package com.company;

public class Main {

    public static void main(String[] args) {
	// Implement the method that takes String and print the first word of the String (all chars before the first space)
        //(“Пример строки”) ->”Пример”
        example("Пример строки");
    }
    public static void example (String str) {
        int i = 0;
        while (i < str.length() && str.charAt(i) != ' ') {
            System.out.print(str.charAt(i++));
        }
    }
}
