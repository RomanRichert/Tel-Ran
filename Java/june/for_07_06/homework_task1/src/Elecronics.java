import java.util.Scanner;

public class Elecronics extends  Product{
    String maker;
    public Elecronics(String name, String maker, double price) {
        super(name, price);
        this.maker = maker;
    }

    public void addGuarantee() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want an additional warranty for 5 years? It will cost just 5% from the price.\n (Press 1 or more to agree, or 0 or less to disagree)");
        if (sc.nextInt()>0) {
        getWarranty();
        } else {
            System.out.println("Thank you for your purchase!\n We will be glad to see you again!");
        }
    }
    private void getWarranty() {
        System.out.println("              Mueller            ");
        System.out.println("            Holzgasse 1,         ");
        System.out.println("          53721 Siegburg         ");
        System.out.println("           022411483760          ");
        System.out.println("---------------------------------");
        System.out.println(getName()+" additional warranty\n              for 5 years");
        System.out.println("TO PAY:                "+getPrice()*5/100+" Euro");

    }
}
