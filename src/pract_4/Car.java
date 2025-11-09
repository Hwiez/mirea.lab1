package pract_4;

public class Car extends Vehicle {
    private String fuelType;

    public Car(String name, double speed, double costPerKm, int capacity, String fuelType) {
        super(name, speed, costPerKm, capacity);
        this.fuelType = fuelType;
    }

    @Override
    public double calculateTime(double distance) {
        return distance / speed;
    }

    @Override
    public double calculatePassengerCost(double distance, int passengers) {
        if (passengers > capacity) {
            System.out.println("Внимание: превышена вместимость! Максимум: " + capacity);
            return -1;
        }
        return distance * costPerKm;
    }

    @Override
    public double calculateCargoCost(double distance, double weight) {
        // Для автомобиля стоимость не зависит от веса (в пределах разумного)
        return distance * costPerKm * (1 + weight / 1000 * 0.1); // +10% за каждую тонну
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Тип топлива: " + fuelType);
        System.out.println("Тип: Автомобиль");
    }
}