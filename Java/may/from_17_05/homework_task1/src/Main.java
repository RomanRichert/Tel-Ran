import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*
Дано два массива int. Написать метод, который считает, сколько значений из первого
массива присутствуют во втором. Например: {10, 14,1,4,3}, {0,1, 6,10, 1,4,13} ->3
 */
    /*
    {1,1,3,5,8}
    {1,2,2,3,5,19,21}
*/
        int[] arr1 = {10, 14,1,1, 4,3};
        int[] arr2 = {0,1, 6,10, 1,4,13};
        int[] arr3 = {1,1,2, 3,5,8};
        int[] arr4 = {1,2,2,3,5,19,21};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));


        System.out.println(countSameNumbers(arr1, arr2));
        System.out.println(countSameNumbers(arr3, arr4));


    }
    public static int countSameNumbers(int[] array1, int[] array2) {
        int counter = 0;
        for (int i = 0; i < array1.length; i++) {
            boolean flag = false;
            for (int j = 0; j < array2.length && !flag; j++) {
                flag = array1[i] == array2[j];
            }
            if (flag) counter++;
        }
        return counter;
    }
}