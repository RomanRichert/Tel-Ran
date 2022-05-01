import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Implement a method that returns new array of int. Every element of the array is next power of two.
        // The length of the array is given n (the max value of n is 30. Why do you think?)
        //powerOfTwo (5) -> {1,2,4,8,16}

        System.out.println(Arrays.toString(newArrayMethod(5)));
        System.out.println(Arrays.toString(newArrayMethod(50)));
    }
    public static int[] newArrayMethod(int n) {

        int[] newArray = new int[n];
        int i = 0; 
        if(n>30){   // the max value of n is 30
            n=30;
        }
        while (i < n) {
            newArray[i] = (int) Math.pow(2, i); // не обязательно использовать Math.pow, умножение на 2 предыдущего значения эфективнее 
            i++;
        }

        return newArray;
    }
}
