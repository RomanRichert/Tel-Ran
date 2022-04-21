import java.util.Scanner ;

public class Main {
    public static void main(String[] args) {
        // Программа получает на вход последовательность целых неотрицательных чисел,
        // каждое число записано в отдельной строке. Последовательность завершается числом 0,
        // при считывании которого программа должна закончить свою работу и вывести количество членов последовательности
        // (не считая завершающего числа 0).
        //
        //Числа, следующие за числом 0, считывать не нужно.
        //входные данные: 1,7, 9, 0, 5

        // Вариант 1:
        Scanner sc = new Scanner(System.in);
        System.out.println("Import the first number of the sequence: ");
        int x = sc.nextInt();
        int sum = 0;

        while (x > 0) {
            System.out.println("Import the next number of the sequence: ");
            x = sc.nextInt();
            sum++;
        }
        System.out.println("1. Sequence length: "+sum);

        // Вариант 2:
        String str1 = "1";
        String str2 = "7";
        String str3 = "9";
        String str4 = "0";
        String str5 = "5";
        String str = "" + str1 + str2 + str3 + str4 + str5;
        int i =0;
        int sequence = 0;

        while (i < str.length() && str.charAt(i) != '0') {
          i++;
          sequence++;
        }
        System.out.println("2. Sequence length: "+sequence);

    }
}