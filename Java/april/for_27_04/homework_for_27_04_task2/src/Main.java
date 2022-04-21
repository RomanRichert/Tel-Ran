import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Определите сумму всех элементов последовательности, завершающейся числом 0.
        //
        //Числа, следующие за нулем, считывать не нужно.
        // 1, 7, 9, 0
        Scanner sc = new Scanner(System.in);
        System.out.println("Import the first number of the sequence: ");
        int x = sc.nextInt();
        int sum =0;

        while (x > 0) {
            sum = sum + x;
            System.out.println("Import the next number of the sequence: ");
            x = sc.nextInt();
        }

        System.out.println("The sum of all numbers in the sequence: "+sum);

    }
}