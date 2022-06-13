import java.util.Scanner;

public class RandomArray implements ArrayReturning{
    @Override
    public Integer[] getArray() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the arrays length: ");
        Integer[] array = new Integer[sc.nextInt()];

        int i = 0;

        while (i < array.length) {
            array[i] = (int) (Math.random() * 2147483647);
            i++;
        }
        return array;
    }
}
