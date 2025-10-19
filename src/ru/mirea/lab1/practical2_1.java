package ru.mirea.lab1;

public class practical2_1 {
    public static void main(String[] args) {
        String[] array = {"1", "11", "111", "1111", "11111"};

        // Выводим исходный массив
        System.out.println("Исходный массив:");
        printArray(array);

        // Переворачиваем массив
        reverseArray(array);

        // Выводим перевернутый массив
        System.out.println("\nПеревернутый массив:");
        printArray(array);
    }

    // Метод для переворачивания массива без использования дополнительного массива
    public static void reverseArray(String[] arr) {
        int start = 0;
        int end = arr.length - 1;

        // Меняем местами элементы от начала к концу
        while (start < end) {
            // Обмен элементов
            String temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Переходим к следующей паре
            start++;
            end--;
        }
    }

    // Метод для вывода массива
    public static void printArray(String[] arr) {
        for (String element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
