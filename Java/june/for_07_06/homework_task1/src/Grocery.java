public class Grocery extends  Product{

    public Grocery(String name, double price) {
        super(name, price);
    }

    public void buy(){
        System.out.println("            Mueller           ");
        System.out.println("          Holzgasse 1,        ");
        System.out.println("        53721 Siegburg        ");
        System.out.println("         022411483760         ");
        System.out.println("------------------------------");
        System.out.println(getName());
        System.out.println("01             1 X "+getPrice()+" = "+getPrice());
        System.out.println();
        System.out.println("Delivery             4.99 Euro");
        System.out.println("TO PAY:              "+(getPrice()+4.99)+" Euro");
    }
}
