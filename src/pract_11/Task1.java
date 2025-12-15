package pract_11;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Task1 {
    public static void main(String[] args) {
        String developer = "Иванов";


        Date startDate = new Date();
        System.out.println("Фамилия разработчика: " + developer);
        System.out.println("Дата и время получения задания: " + startDate);


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        Date endDate = new Date();
        System.out.println("Дата и время сдачи задания: " + endDate);


        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        System.out.println("\nС форматированием:");
        System.out.println("Получение: " + sdf.format(startDate));
        System.out.println("Сдача: " + sdf.format(endDate));
    }
}