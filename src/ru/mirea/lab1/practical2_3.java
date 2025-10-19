package ru.mirea.lab1;
import java.util.Scanner;
public class practical2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст:");
        String text = scanner.nextLine();

        // Делим на слова (только буквы)
        String[] words = text.split("[^a-zA-Zа-яА-Я]+");

        int count = 0;
        for (String word : words) {
            if (!word.isEmpty()) {
                count++;
            }
        }

        System.out.println("Вы ввели слов: " + count);

        scanner.close();
    }
}
