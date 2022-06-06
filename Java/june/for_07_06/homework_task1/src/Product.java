public abstract class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void buy () {
        System.out.println("            Mueller           ");
        System.out.println("          Holzgasse 1,        ");
        System.out.println("        53721 Siegburg        ");
        System.out.println("         022411483760         ");
        System.out.println("------------------------------");
        System.out.println(name);
        System.out.println("01         1 X "+price+" = "+price);
        System.out.println();
        System.out.println("TO PAY:            "+price+" Euro");
    }

    public String getName() {
        return name;
    }

    public void discount (int discount) {
        price = price-(price*discount/100);
    }
}

