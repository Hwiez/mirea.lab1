package pract_4;

public class Train extends Vehicle {
    private int numberOfCars;

    public Train(String name, double speed, double costPerKm, int capacity, int numberOfCars) {
        super(name, speed, costPerKm, capacity);
        this.numberOfCars = numberOfCars;
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
        return distance * costPerKm * (passengers / 50.0); // скидка за количество
    }

    @Override
    public double calculateCargoCost(double distance, double weight) {
        return distance * costPerKm * (weight / 1000); // за тонну
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Количество вагонов: " + numberOfCars);
        System.out.println("Тип: Поезд");
    }
}
