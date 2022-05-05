import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //*Задача обратная предыдущему пункту. Допустим, дано число long реализовать метод,
        //который вернет массив int состоящий из разрядов этого числа.
        //Например: {1,3,7} -> 137

        long input = 137;
        System.out.println(Arrays.toString(longToArray(input)));

    }
    public static int[] longToArray (long number) {

        int numberInt = (int) number;
        int[] array = new int[String.valueOf(number).length()];
        int i = array.length-1;

        while (i >= 0) {
            array[i] = numberInt % (int) Math.pow(10, 1);
            numberInt = (numberInt - array[i]) / (int) Math.pow(10, 1);
            i--;
        }

        return array;
    }
}