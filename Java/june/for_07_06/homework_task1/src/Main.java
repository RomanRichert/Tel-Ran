import com.company.Dress;
import com.company.Grocery;
import com.company.Laptop;
import com.company.Smartphone;

public class Main {
    public static void main(String[] args) {
        // Допустим, у нас есть магазин. В нашем магазине есть товары трех категорий: продукты, электроника
        // (мобильные телефоны и ноутбуки), одежда. У каждого товара есть цена и наименование .
        // Каждый товар можно купить (покупателю выставляется счет с цена).
        //
        //при покупки продуктов выставляется дополнительная цена за срочность доставки.
        //при покупке электроники, покупателю предлагается оформить дополнительную гарантию.
        //Телефоны продаются только с контрактом оператора.
        //на отдельные категории иногда товаров действует скидка
        //Необходимо создать соответствующую структуру классов

        Dress jeans1 = new Dress("jeans1", "32/34", 29.99);
        Dress tShirt1 = new Dress("t-shirt1", "M", 14.99);
        Dress socks1 = new Dress("socks1", "39-42", 9.99);

        Laptop laptop1 = new Laptop("Lenovo", "ideapad L340", "8 GB DDR4 2400MHz", 999.90);
        Smartphone smartphone1 = new Smartphone("Samsung", "Galaxy A53 5G", "Black", 409.0,34.99);

        Grocery onion = new Grocery("Onion 1Kg", 1.99);
        Grocery milk = new Grocery("Milk 1L", 0.87);

        //smartphone1.buy(2);
        //laptop1.buy(3);




    }
}