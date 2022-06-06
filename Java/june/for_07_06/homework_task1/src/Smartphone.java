public class Smartphone extends Elecronics{
    String color;
    double contractPrice;
    public Smartphone(String maker, String name, String color, double price, double contractPrice) {
        super(name, maker, price);
        this.color = color;
        this.contractPrice = contractPrice;
    }
    @Override
    public void buy() {
        System.out.println("              Mueller            ");
        System.out.println("            Holzgasse 1,         ");
        System.out.println("          53721 Siegburg         ");
        System.out.println("           022411483760          ");
        System.out.println("---------------------------------");
        System.out.println("01 "+getName());
        System.out.println("               1 X   "+getPrice()+" = "+getPrice());
        System.out.println("02 contract");
        System.out.println("               1 X   "+contractPrice+" = "+contractPrice);
        System.out.println();
        System.out.println("Smartphone+contract discount = 70%");
        System.out.println();
        System.out.println("TO PAY:        1 X     "+(getPrice()-(getPrice()*70/100)+contractPrice)+" Euro");
        System.out.println("               Monthly: "+contractPrice+" Euro");
        System.out.println("---------------------------------");
        addGuarantee();
    }
}
