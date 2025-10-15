package ru.mirea.lab1;

public class practical1_1 {
    public static void main(String[] args) {
        int[] numbers = {5, 8, 3, 17, 9, 5, 14, 2, 10};

        int sum = 0;
        double average;

        System.out.print("Массив чисел: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        average = (double) sum / numbers.length;

        System.out.println("Сумма элементов массива: " + sum);
        System.out.printf("Среднее арифметическое: %.2f\n", average);
    }

}
