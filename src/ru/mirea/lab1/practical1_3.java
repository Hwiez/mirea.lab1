package ru.mirea.lab1;

public class practical1_3 {
    public static void main(String[] args) {
        System.out.println("Аргументы командной строки:");

        for (int i = 0; i < args.length; i++) {
            System.out.println("Аргумент " + i + ": " + args[i]);
        }
    }
}
