public class Main {
    public static void main(String[] args) {
        Product bicycle = new Product("Bicycle", 50000, 0.9);
        Product rollerSkates = new Product("Roller-skates", 15000, 0.1);
        Product skis = new Product("Skis", 2500, null);

        skis.printDiscount();

        Client num1 = new Client("Alex", "Ivanov", 1, "Ufa");
        Client num2 = new Client("Boris", "Kalinin", 7, "Jerewan");
        Client num3 = new Client("Petr", "Suworov", 2, "Kazan");

        Locator id1 = new Locator(1, "+7(495)563-83-79", "ivan.92@mail.ru");
        Locator id7 = new Locator(7, "+374(905)980-02-08", "Bor.Kalin@mail.ru");
        Locator id2 = new Locator(2, "+374(905)750-44-13", "Nik.nik@mail.ru");

        num2.printLocator( id2);


    }
}