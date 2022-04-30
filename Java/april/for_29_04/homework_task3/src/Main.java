public class Main {
    public static void main(String[] args) {
        // Implement a method that returns the sum of elements of the given array of int
        //{10, 3, 23, 5, -9} -> 32
        int[] array = {10, 3, 23, 5, -9};
        System.out.println(sumOfElements(array));
    }
    public static int sumOfElements (int[] arr) {
        int sum = 0;
        int i = 0;
        while (i < arr.length){
            sum= sum + arr[i];
            i++;
        }
        return sum;
    }
}