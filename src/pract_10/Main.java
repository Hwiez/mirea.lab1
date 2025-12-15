package pract_10;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Student> list1 = Arrays.asList(
                new Student("Иван", "Иванов", "Информатика", 2, "КВБО-12-24", 4.5),
                new Student("Петр", "Петров", "Математика", 3, "ККБО-11-21", 4.2),
                new Student("Максим", "Гулиев", "Физика", 1, "БФБО-14-24", 5.0)
        );

        List<Student> list2 = Arrays.asList(
                new Student("Мария", "Кузнецова", "Химия", 4, "ККБО-13-23", 4.0),
                new Student("Алексей", "Смирнов", "Биология", 2, "КМБО-22-22", 4.7),
                new Student("Ольга", "Васильева", "Информатика", 3, "ИВТТ-16-25", 4.9)
        );


        List<Student> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);


        SortingStudentsByGPA sorter = new SortingStudentsByGPA();
        sorter.setArray(mergedList);
        System.out.println("До сортировки:");
        sorter.outArray();

        System.out.println("\nПосле быстрой сортировки по среднему баллу:");
        sorter.quicksort();
        sorter.outArray();

        // Сортировка по фамилии (слиянием)
        System.out.println("\nПосле сортировки слиянием по фамилии:");
        sorter.mergeSortByLastName();
        sorter.outArray();
    }
}