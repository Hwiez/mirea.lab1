package pract_6;

// Интерфейс Priceable
interface Priceable {
    double getPrice();
}

// Класс Book
class Book implements Priceable {
    private String title;
    private double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}