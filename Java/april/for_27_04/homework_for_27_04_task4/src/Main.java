import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Последовательность состоит из различных натуральных чисел и завершается числом 0. Определите значение второго по величине элемента в этой последовательности.
        //
        //Числа, следующие за числом 0, считывать не нужно.
        // 1, 7, 9, 0

        Scanner sc = new Scanner(System.in);
        System.out.println("Import the first number of the sequence: ");
        int x1 = sc.nextInt();
        System.out.println("Import the second number of the sequence: ");
        int x2 = sc.nextInt();
        int max = 0;
        int max2 = 0;

        while (x1 > 0 && x2 > 0) {

            if (x1 > max) {
                max2 = max;
                max = x1;
            }
            if (x2 > max) {
                max2 = max;
                max = x2;
            }
            if (x2 < max && max2 < x2) {
                max2 = x2;
            }

            x1 = x2;
            System.out.println("Import the next number of the sequence: ");
            x2 = sc.nextInt();
        }

        System.out.println("The second maximum of the sequence is: "+max2);
    }
}