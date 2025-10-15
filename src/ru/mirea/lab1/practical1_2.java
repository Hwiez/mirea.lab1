package ru.mirea.lab1;
import java.util.Scanner;
public class practical1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Введите элементы массива:");
        int i = 0;
        do {
            System.out.print("Элемент " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
            i++;
        } while (i < size);

        System.out.print("\nВведенный массив: ");
        i = 0;
        while (i < size) {
            System.out.print(numbers[i] + " ");
            i++;
        }
        System.out.println();

        int sum = 0;
        i = 0;
        while (i < size) {
            sum += numbers[i];
            i++;
        }

        int max = numbers[0];
        i = 1;
        do {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            i++;
        } while (i < size);

        int min = numbers[0];
        i = 1;
        while (i < size) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            i++;
        }

        System.out.println("\nРезультаты:");
        System.out.println("Сумма элементов: " + sum);
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);

        scanner.close();
    }

}
