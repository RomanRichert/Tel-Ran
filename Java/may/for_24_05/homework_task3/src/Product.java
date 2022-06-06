public class Product {
    String title;
    int price;
    Double discount;

    public Product (String title, int price, Double discount) {
        this.title = title;
        this.price = price;
        this.discount = discount;
    }

    public void printDiscount() {

        System.out.println(title +" "+ ((discount != null) ? ((price*discount) +" "+ "(Discount: " + (price - (price*discount)) +")") : (price +" "+ "(Discount: " + 0 +")")));
    }
}
