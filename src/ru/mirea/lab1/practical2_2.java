package ru.mirea.lab1;
import java.util.*;
public class practical2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Сколько игроков? ");
        int n = scanner.nextInt();

        // Проверка
        if (n < 1 || n > 10) {
            System.out.println("Можно от 1 до 10 игроков!");
            return;
        }

        // Создаем колоду
        String[] masti = {"Пики", "Черви", "Бубны", "Крести"};
        String[] karti = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"};

        ArrayList<String> koloda = new ArrayList<>();

        // Заполняем колоду
        for (String mast : masti) {
            for (String karta : karti) {
                koloda.add(karta + " " + mast);
            }
        }

        // Перемешиваем
        Collections.shuffle(koloda);

        // Раздаем карты
        System.out.println("\nРаздача карт:");

        for (int igrok = 0; igrok < n; igrok++) {
            System.out.println("Игрок " + (igrok + 1) + ":");

            // По 5 карт каждому
            for (int i = 0; i < 5; i++) {
                int nomerKarti = igrok * 5 + i;
                System.out.println(koloda.get(nomerKarti));
            }
            System.out.println(); // Пустая строка
        }

        scanner.close();
    }
}
