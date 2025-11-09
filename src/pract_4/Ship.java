package pract_4;

public class Ship extends Vehicle {
    private double displacement;

    public Ship(String name, double speed, double costPerKm, int capacity, double displacement) {
        super(name, speed, costPerKm, capacity);
        this.displacement = displacement;
    }

    @Override
    public double calculateTime(double distance) {
        return distance / speed * 1.1; // +10% времени из-за течений
    }

    @Override
    public double calculatePassengerCost(double distance, int passengers) {
        if (passengers > capacity) {
            System.out.println("Внимание: превышена вместимость! Максимум: " + capacity);
            return -1;
        }
        return distance * costPerKm * passengers;
    }

    @Override
    public double calculateCargoCost(double distance, double weight) {
        return distance * costPerKm * (weight / displacement * 10);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Водоизмещение: " + displacement + " тонн");
        System.out.println("Тип: Корабль");
    }
}
