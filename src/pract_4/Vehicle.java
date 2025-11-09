package pract_4;

public abstract class Vehicle {
    protected String name;
    protected double speed; // км/ч
    protected double costPerKm; // стоимость за км
    protected int capacity; // вместимость

    public Vehicle(String name, double speed, double costPerKm, int capacity) {
        this.name = name;
        this.speed = speed;
        this.costPerKm = costPerKm;
        this.capacity = capacity;
    }

    // Абстрактные методы
    public abstract double calculateTime(double distance);
    public abstract double calculatePassengerCost(double distance, int passengers);
    public abstract double calculateCargoCost(double distance, double weight);

    // Конкретные методы
    public void displayInfo() {
        System.out.println("Транспорт: " + name);
        System.out.println("Скорость: " + speed + " км/ч");
        System.out.println("Вместимость: " + capacity + " человек");
        System.out.println("Стоимость за км: " + costPerKm + " руб.");
    }

    // Геттеры
    public String getName() {
        return name;
    }

    public double getSpeed() {
        return speed;
    }

    public double getCostPerKm() {
        return costPerKm;
    }

    public int getCapacity() {
        return capacity;
    }
}

