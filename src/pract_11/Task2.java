package pract_11;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");


        Date currentDate = new Date();
        System.out.println("Текущая дата: " + currentDate);


        System.out.print("Введите дату (формат dd.MM.yyyy): ");
        String inputDateStr = scanner.nextLine();

        try {
            Date inputDate = sdf.parse(inputDateStr);


            System.out.println("\nСравнение дат:");
            System.out.println("Введенная дата: " + inputDate);
            System.out.println("Текущая дата: " + currentDate);

            if (inputDate.equals(currentDate)) {
                System.out.println("Даты равны");
            } else if (inputDate.before(currentDate)) {
                System.out.println("Введенная дата РАНЬШЕ текущей");
            } else {
                System.out.println("Введенная дата ПОЗЖЕ текущей");
            }


            int result = inputDate.compareTo(currentDate);
            System.out.print("Результат compareTo: ");
            if (result == 0) {
                System.out.println("Даты равны");
            } else if (result < 0) {
                System.out.println("Введенная дата меньше текущей");
            } else {
                System.out.println("Введенная дата больше текущей");
            }

        } catch (ParseException e) {
            System.out.println("Ошибка формата даты!");
        }

        scanner.close();
    }
}