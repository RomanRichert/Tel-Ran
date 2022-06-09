import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Sender send = new Sender(0);

        System.out.println("Type: \n 1. to send a letter by DHL \n 2. to send an Email \n 3. to send a letter by pigeon mail");
        send.send(sc.nextInt());




    }
}