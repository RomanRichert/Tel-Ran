import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Implement a method that returns the new array that is the given array in reverse order
        //{10, 3, 3, 5, -9} -> {-9, 5, 3, 3, 10}
        int[] array = {10, 3, 3, 5, -9};

        System.out.println(Arrays.toString(reverseArrayMethod(array)));
    }
    public static int[] reverseArrayMethod (int[] arr) {
        int[] newArray = new int[arr.length];
        int iN = arr.length-1;
        int i = 0;
        while (iN >= 0) {
            newArray[i] = arr[iN];
            iN--;
            i++;
        }
        return newArray;
    }
}