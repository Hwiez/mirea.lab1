package pract_11;

import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите данные для создания даты:");


        System.out.print("Год : ");
        int year = scanner.nextInt();

        System.out.print("Месяц (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Число (1-31): ");
        int day = scanner.nextInt();

        System.out.print("Часы (0-23): ");
        int hours = scanner.nextInt();

        System.out.print("Минуты (0-59): ");
        int minutes = scanner.nextInt();


        @SuppressWarnings("deprecation")
        Date date = new Date(year - 1900, month - 1, day, hours, minutes);
        System.out.println("\n1. Объект Date:");
        System.out.println("   Date: " + date);


        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day, hours, minutes, 0);
        Date dateFromCalendar = calendar.getTime();

        System.out.println("\n2. Объект Calendar:");
        System.out.println("   Calendar -> Date: " + dateFromCalendar);
        System.out.println("   Год: " + calendar.get(Calendar.YEAR));
        System.out.println("   Месяц: " + (calendar.get(Calendar.MONTH) + 1));
        System.out.println("   День: " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("   Часы: " + calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("   Минуты: " + calendar.get(Calendar.MINUTE));


        System.out.println("\n3. Создание через строку:");
        String dateString = String.format("%02d.%02d.%04d %02d:%02d",
                day, month, year, hours, minutes);
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm");

        try {
            Date parsedDate = sdf.parse(dateString);
            System.out.println("   Парсинг строки: " + parsedDate);
        } catch (ParseException e) {
            System.out.println("Ошибка парсинга даты");
        }

        scanner.close();
    }
}