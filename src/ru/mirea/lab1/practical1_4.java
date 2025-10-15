package ru.mirea.lab1;

public class practical1_4 {
    public static void main(String[] args) {
        System.out.println("Первые 10 чисел гармонического ряда:");

        for (int n = 1; n <= 10; n++) {
            double harmonicNumber = 0.0;

            for (int i = 1; i <= n; i++) {
                harmonicNumber += 1.0 / i;
            }


            System.out.println("H("+ n + ") = " + harmonicNumber );
        }
    }
}
