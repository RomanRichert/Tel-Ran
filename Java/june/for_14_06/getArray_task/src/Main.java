import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDistributer giveMeAnArray = new ArrayDistributer();

        System.out.println("Type: \n 1. to enter your own array \n 2. to get a random array \n 3. to get [-100, -1, 30, 52, 1547, 0, 1, 1, 73, 37, 21, null, 27]");

        System.out.println(Arrays.toString(giveMeAnArray.getArray(sc.nextInt())));

    }
}