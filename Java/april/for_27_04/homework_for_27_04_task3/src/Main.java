import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Последовательность состоит из натуральных чисел и завершается числом 0. Определите, сколько элементов этой последовательности больше предыдущего элемента.
        //
        //Числа, следующие за числом 0, считывать не нужно.
        // 1, 7, 9, 0

        Scanner sc = new Scanner(System.in);
        System.out.println("Import the first number of the sequence: ");
        int x1 = sc.nextInt();
        System.out.println("Import the second number of the sequence: ");
        int x2 = sc.nextInt();
        int greater = 0;

        while (x1 > 0 && x2 > 0) {
            if (x2 > x1) {
                greater++;
            }
            x1 = x2;
            System.out.println("Import the next number of the sequence: ");
            x2 = sc.nextInt();

        }
        System.out.println(greater+" numbers of the sequence are greater then the previous one.");


    }
}