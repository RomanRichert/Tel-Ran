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

        int[] array = new int[String.valueOf(number).length()];
        int i = array.length-1;

        while (i >= 0) {
            array[i] = (int) number % 10;
              number = ((int) number - array[i]) / 10;
            i--;
        }

        return array;
    }
}