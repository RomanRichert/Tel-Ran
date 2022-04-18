import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // Implement the program that read Integers from Scanner and prints the sum of all integers were input.
        // The program will finish when 0 input.
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number:");
        int number = sc.nextInt();
        int sum = 0;

        while (number != 0) {
            sum = sum + number;
            System.out.println(sum);
            System.out.println("Input a number:");
            number = sc.nextInt();
        }
    }
}
