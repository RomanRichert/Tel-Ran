import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Implement a method that returns the index of the biggest element of a given array of int
        //{10, 33, 3, 5, -9} -> 1
        int[] arr = {10, 33, 3, 5, -9};
        System.out.println(biggestIndexInArray(arr));

    }


    public static int biggestIndexInArray (int[] array) {
        int i = 0;
        int arrElement;
        int maxArrElement = 0;
        int maxIndex = 0;
        while (i < array.length) {
            arrElement = array[i];
            if (arrElement > maxArrElement) {
                maxArrElement = arrElement;
                maxIndex = i;
            }
            i++;
        }
        return maxIndex;
    }
}