import java.util.Scanner;

public class UserArray implements ArrayReturning {

    @Override
    public Integer[] getArray() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the arrays length: ");
        Integer[] array = new Integer[sc.nextInt()];

        int i = 0;
        System.out.println("Enter array elements: ");
        while (i < array.length) {
            array[i] = sc.nextInt();
            i++;
        }


        return array;
    }
}
