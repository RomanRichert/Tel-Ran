import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Дана дробь a/b. Требуется ее сократить, то есть записать это же число в виде c/d,
        // где c — целое число, d — натуральное число и d минимальное возможное.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = a/nod(a, b);
        int d = b/nod(a, b);

        System.out.println(c);
        System.out.println(d);

        sc.close();
    }
    public static int nod (int a, int b) {
        int nod = 1;

        if (a==0) {
            nod = b;
            return nod;
        }


        while (a > 0 && b > 0) {
            if (a >= b) {
                a = a-b;
            } else  {
                b = b-a;
            }
            if (b == a ){
                nod = a;

            }
        }

        return nod;
    }
}