import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Imagine in our program we process an array (for example, an array of integers, or an array of Employee if you want).
        // In production environment we read this array from User (use Scanner),
        // in test environment we get it as random array or use an array defined in the code.
        // So, you need to implement a method getArray() witch as argument takes the way,
        // how the array will be created and as a result returns the array. Implement this program (hint: use knowledge about interface)

        Scanner sc = new Scanner(System.in);
        ArrayDistributer giveMeAnArray = new ArrayDistributer();

        System.out.println("Type: \n 1. to enter your own array \n 2. to get a random array \n 3. to get [-100, -1, 30, 52, 1547, 0, 1, 1, 73, 37, 21, null, 27]");

        System.out.println(Arrays.toString(giveMeAnArray.getArray(sc.nextInt())));

    }
}