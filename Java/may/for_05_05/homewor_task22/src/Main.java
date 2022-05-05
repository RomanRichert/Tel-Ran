public class Main {
    public static void main(String[] args) {
        // Допустим, дан массив int, каждое значение в котором лежит в диапазоне от 0 до 9.
        //Реализовать метод, который вернет число long, которое поразрядно состоит из элементов
        //заданного массива
        //Например: {1,3,7} -> 137
        int[] array = {1,3,7};
        System.out.println(arrayToLong(array));
    }
    public static long arrayToLong (int[] arr) {
        int i = arr.length -1;
        long result =0;
        int mathPow = 0;
        if (arr[i] >=0 && arr[i] <=9) {
            while (i >= 0) {
                result = result + (arr[i] * (int) Math.pow(10, mathPow));
                mathPow++;
                i--;
            }
        } else {
            System.out.println("Wrong array for this method!");
        }
        return result;
    }
}