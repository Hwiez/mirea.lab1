package pract_4;

public class Airplane extends Vehicle {
    private double flightAltitude;

    public Airplane(String name, double speed, double costPerKm, int capacity, double flightAltitude) {
        super(name, speed, costPerKm, capacity);
        this.flightAltitude = flightAltitude;
    }

    @Override
    public double calculateTime(double distance) {
        // Учитываем время взлета и посадки
        return (distance / speed) + 1.5; // +1.5 часа на взлет/посадку
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
        return distance * costPerKm * weight / 100; // стоимость зависит от веса
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Высота полета: " + flightAltitude + " м");
        System.out.println("Тип: Самолет");
    }
}