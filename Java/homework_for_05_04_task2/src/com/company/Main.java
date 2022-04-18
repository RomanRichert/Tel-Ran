package com.company;

public class Main {

    public static void main(String[] args) {
	// Implement the method that takes String, int startIndex, int endIndex.
        // The method returns the substring of the given String between startIndex and endIndex
        // (startIndex inclusive endIndex exclusive). You have to use only length() and charAt() methods of String class.
        //substring(“It is my own method”,9,12) ->”own”
        System.out.println(ownMethod("It is my own method", 9, 12));


    }
    public static String ownMethod ( String str, int startIndex, int endIndex) {
                                 // зачем здесь нужен "length()" ?

        String result = "";
        while (startIndex<endIndex) {
            result=result + str.charAt(startIndex);
            startIndex++;

        }
        return result;
    }
}
