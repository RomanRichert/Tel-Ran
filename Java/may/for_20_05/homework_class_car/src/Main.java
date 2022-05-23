public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("smart EQ fortwo", 2020, "Gray");
        Car car2 = new Car("Hyundai Kona Elektro", 2022, "Red");
        Car car3 = new Car("VW e-up!", 2020, "Yellow");
        Car car4 = new Car("Renault Zoe Z.E. 50 (R135)", 2021, "Cyan");
        Car car5 = new Car("Opel Corsa-e", 2021, "Gray");

        car1.print();
        car2.print();
        car3.print();
        car4.print();
        car5.print();
    }
}