package pract_4;

public abstract class Furniture {
    protected String name;
    protected double price;
    protected String material;

    public Furniture(String name, double price, String material) {
        this.name = name;
        this.price = price;
        this.material = material;
    }

    // Абстрактные методы
    public abstract void assemble();
    public abstract String getDescription();

    // Конкретные методы
    public void displayInfo() {
        System.out.println("Мебель: " + name);
        System.out.println("Цена: " + price + " руб.");
        System.out.println("Материал: " + material);
        System.out.println("Описание: " + getDescription());
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getMaterial() {
        return material;
    }
}

