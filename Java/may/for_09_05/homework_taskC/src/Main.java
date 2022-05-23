import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();


        System.out.println(1+nod(x2-x1, y2-y1));
        sc.close();
    }
    public static int nod (int a, int b) {
        int nod = 0;
        while (a > 0 && b > 0) {
            if (a >= b) {
                a = a - b;
            } else {
                b = b - a;
            }
            if (b == a) {
                nod = a;

            }
        }
        if (nod == 0) {
            if (a > 0) {
                nod = a;
                return nod;
            } else if (b > 0) {
                nod = b;
                return nod;
            }
        } else {
            return nod;
        }
        return nod;
    }
}