package pract_6;

public class Main_Priceable {
    public static void main(String[] args) {
        Priceable book = new Book("Java Programming", 29.99);
        Priceable car = new Car("Toyota Camry", 25000.0);

        System.out.println("Book price: $" + book.getPrice());
        System.out.println("Car price: $" + car.getPrice());
    }
}