package ru.mirea.lab1;
import java.util.Scanner;
public class practical1_5 {
    public static void main(String[] args) {
        Scanner scannner = new Scanner(System.in);

        System.out.print("Введите число: ");

        int number = scannner.nextInt();

        if (number < 0) {
            System.out.println("Ошибка: факториал отрицательного числа не существует!");
        } else {
            long result = 1;
            for (int i = 1; i <= number; i++) {
                result = result * i;
            }

            System.out.println("Результат: " + number + "! = " + result);
        }

        scannner.close();
    }
}

