import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Дано, массив и число. Написать метод, который возвращает новый массив, в который добавлено это число, причем
        //так, что все числа исходного массива, которые меньше его, находятся левее, те которые больше или равны -
        //правее. При этом порядок элементов не важен.

        int number = 33;
        int[] array = {102, 15, 82, 33, 7, 0, 95, 12};
        System.out.println(Arrays.toString(arrayWithTheNumber(array, number)));

    }
    public static int[] arrayWithTheNumber (int[] arr, int num) {
        int i = 0;
        int[] newArray = new int[arr.length +1];
        int lessThanNumber = 0;
        int greaterThanNumber = arr.length ;


        while (i < arr.length) {
            if (arr[i] < num) {
                newArray[lessThanNumber] = arr[i];
                lessThanNumber++;
            } else {
                newArray[greaterThanNumber] = arr[i];
                greaterThanNumber--;
            }
            i++;
        }

        newArray[lessThanNumber]= num;


        return newArray;
    }
}