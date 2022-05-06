import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //*Задача обратная предыдущему пункту. Допустим, дано число long реализовать метод,
        //который вернет массив int состоящий из разрядов этого числа.
        //Например: {1,3,7} -> 137

        long input = 137;
        System.out.println(Arrays.toString(longToArray(input)));

    }
    public static long[] longToArray (long number) {

        long[] array = new long[String.valueOf(number).length()];
        int i = array.length-1;

        while (i >= 0) {
            array[i] = number % 10;
            number = (number - array[i]) / 10;
            i--;
        }

        return array;
    }
}