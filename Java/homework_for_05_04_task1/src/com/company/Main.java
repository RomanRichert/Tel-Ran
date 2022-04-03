package com.company;

public class Main {

    public static void main(String[] args) {
	// Implement the method that takes String and print the first word of the String (all chars before the first space)
        //(“Пример строки”) ->”Пример”
        System.out.println(example("Пример строки"));
    }
    public static String example (String str) {
        return ""+str.charAt(0)+str.charAt(1)+str.charAt(2)+str.charAt(3)+str.charAt(4)+str.charAt(5);
    }
}
