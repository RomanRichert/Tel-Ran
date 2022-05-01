public class Main {
    public static void main(String[] args) {
        // Implement a method that prints all elements of the given array that bigger than average value of array elements
        //{2, 6, 5, 3} -> 6 5
        int[] array = {2, 6, 5, 3};
        printsAllElementsOfTheGivenArrayThatBiggerThanAverageValueOfArrayElements(array);
    }
    public static void printsAllElementsOfTheGivenArrayThatBiggerThanAverageValueOfArrayElements (int[] arr) {
        int i = 0;
        int sum = 0;
        while (i < arr.length) { //!
            sum = sum + arr[i];
            i++;
        }
        i = 0;
        int average = sum/ arr.length;
        while (i < arr.length) {
            if (arr[i] > average) {
                System.out.println(arr[i]);
            }
            i++;
        }
    }
}
