import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        int nod = 1;
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
        System.out.println(nod);
        sc.close();
    }
}