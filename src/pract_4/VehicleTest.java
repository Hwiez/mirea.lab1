package pract_4;

public class VehicleTest {
    public static void main(String[] args) {
        // Создание транспортных средств
        Vehicle[] vehicles = {
                new Car("Toyota Camry", 90, 5, 4, "бензин"),
                new Airplane("Boeing 737", 800, 15, 180, 10000),
                new Train("Сапсан", 160, 3, 500, 10),
                new Ship("Круизный лайнер", 40, 8, 2000, 50000)
        };

        double distance = 500; // км
        int passengers = 150;
        double cargoWeight = 1000; // кг

        System.out.println("=== СРАВНЕНИЕ ТРАНСПОРТНЫХ СРЕДСТВ ===");
        System.out.println("Дистанция: " + distance + " км");
        System.out.println("Пассажиров: " + passengers);
        System.out.println("Груз: " + cargoWeight + " кг\n");

        for (Vehicle vehicle : vehicles) {
            System.out.println("=== " + vehicle.getName() + " ===");
            vehicle.displayInfo();

            double time = vehicle.calculateTime(distance);
            double passengerCost = vehicle.calculatePassengerCost(distance, passengers);
            double cargoCost = vehicle.calculateCargoCost(distance, cargoWeight);

            System.out.printf("Время в пути: %.2f часов\n", time);

            if (passengerCost != -1) {
                System.out.printf("Стоимость перевозки пассажиров: %.2f руб.\n", passengerCost);
            }

            System.out.printf("Стоимость перевозки груза: %.2f руб.\n", cargoCost);
            System.out.println();
        }
    }
}