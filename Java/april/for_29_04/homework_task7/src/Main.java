public class Main {
    public static void main(String[] args) {
        //Implement a method that makes a given array in reverse order. It’s look like previous
        //but you should solve it without new array
        //{10, 3, 3, 5, -9} -> {-9, 5, 3, 3, 10}
        int[] array = {10, 3, 3, 5, -9};
        reversedArrayMethod(array);
    }
    public static void reversedArrayMethod (int[] arr) {
        System.out.print("{");
        int i = arr.length -1;
        while (i > 0) {
            System.out.print(arr[i] + ", ");
            i--;
        }
        System.out.print(arr[0]+"}");
    }
}