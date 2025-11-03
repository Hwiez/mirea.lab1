package pract_4;

// Интерфейсы
interface MenClothing {
    void dressMan();
}

interface WomenClothing {
    void dressWomen();
}

// Абстрактный класс одежды
abstract class Clothes {
    protected Size size;
    protected double cost;
    protected String color;

    public Clothes(Size size, double cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }
}