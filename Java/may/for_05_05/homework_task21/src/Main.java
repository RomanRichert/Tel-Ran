public class Main {
    public static void main(String[] args) {
        //*Дано два массива int. Написать метод, который считает, сколько значений из первого
        //массива присутствуют во втором. Например: {10, 14,1,4,3}, {0,1, 6,10, 1,4,13} ->3
        int[] array1 = {10, 14, 1, 4, 3};
        int[] array2 = {0, 1, 6, 10, 1, 4, 13};

        identicalIntegers(array1, array2);
    }

    public static void identicalIntegers(int[] arr1, int[] arr2) {         // метод считает неправильно, если
        int i = 0; //шаг для внешнего цикла                                    в наименьшем по размеру массиве
        int ii;    // шаг для внутреннего цикла                                есть повторяющиеся значения
        int a;
        int identical = 0;
        if (arr1.length < arr2.length) {                                   //если 1 массив больше
            while (i < arr1.length) {
                ii = 0;
                a = 0;
                while (ii < arr2.length) {
                    if (arr1[i] == arr2[a]) {
                        identical++;
                        break;
                    }
                    a++;
                    ii++;
                }
                i++;
            }
        } else {
            while (i < arr2.length) {                                       // если 2й массив больше
                ii = 0;
                a = 0;
                while (ii < arr1.length) {
                    if (arr2[i] == arr1[a]) {
                        identical++;
                        break;
                    }
                    a++;
                    ii++;
                }
                i++;
            }
        }
        System.out.println(identical);
    }
}