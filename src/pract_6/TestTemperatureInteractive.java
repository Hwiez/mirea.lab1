package pract_6;

import java.util.Scanner;

public class TestTemperatureInteractive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Конвертер температур ===");
        System.out.print("Введите температуру в градусах Цельсия: ");

        double celsius = scanner.nextDouble();

        Convertable converter = new TemperatureConverter(celsius);
        converter.convert();

        scanner.close();
    }
}