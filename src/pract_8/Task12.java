package pract_8;

import java.util.Scanner;

public class Task12 {
    private static Scanner scanner = new Scanner(System.in); // Аналогично заданию 11

    public static void main(String[] args) {
        System.out.println("Введите последовательность чисел (завершается нулём): ");
        printOddNumbers();
        scanner.close();
    }

    public static void printOddNumbers() {
        int num = scanner.nextInt();
        if (num == 0) {
            return; // завершение
        }
        if (num % 2 != 0) {
            System.out.println(num); // выводим нечётное
        }
        printOddNumbers(); // рекурсивный вызов для следующего числа
    }
}