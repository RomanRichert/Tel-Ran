package com.company;

public class Product {
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

    public void buy (int amount) {
        header();
        System.out.println("01 "+getName());
        System.out.println("               "+amount+" X   "+getPrice()+" = "+amount*getPrice());
        toPay(amount);
    }

     protected void header() {
        System.out.println("              Mueller             ");
        System.out.println("            Holzgasse 1,          ");
        System.out.println("          53721 Siegburg          ");
        System.out.println("           022411483760           ");
        footer();
    }

    private void toPay(int amount) {
        System.out.println("TO PAY:            "+amount*price+" Euro");
        footer();
    }

    public String getName() {
        return name;
    }

    public void discount (int discount) {
        price = price-(price*discount/100);
    }

    protected void footer (){
        System.out.println("----------------------------------");
    }
}



