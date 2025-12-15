package pract_11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        int size = 100000;
        Random random = new Random();

        System.out.println("Сравнение производительности ArrayList и LinkedList");
        System.out.println("Размер коллекции: " + size + " элементов\n");


        System.out.println("1. Добавление в конец:");
        testAddToEnd(new ArrayList<>(), size, "ArrayList");
        testAddToEnd(new LinkedList<>(), size, "LinkedList");


        System.out.println("\n2. Добавление в начало:");
        testAddToBeginning(new ArrayList<>(), size, "ArrayList");
        testAddToBeginning(new LinkedList<>(), size, "LinkedList");


        System.out.println("\n3. Вставка в середину:");
        testInsertMiddle(new ArrayList<>(), size, "ArrayList");
        testInsertMiddle(new LinkedList<>(), size, "LinkedList");


        System.out.println("\n4. Поиск элемента:");
        testSearch(new ArrayList<>(), size, "ArrayList");
        testSearch(new LinkedList<>(), size, "LinkedList");


        System.out.println("\n5. Удаление из начала:");
        testRemoveFromBeginning(new ArrayList<>(), size, "ArrayList");
        testRemoveFromBeginning(new LinkedList<>(), size, "LinkedList");


        System.out.println("\n6. Удаление из конца:");
        testRemoveFromEnd(new ArrayList<>(), size, "ArrayList");
        testRemoveFromEnd(new LinkedList<>(), size, "LinkedList");
    }


    private static void testAddToEnd(List<Integer> list, int size, String name) {
        long startTime = System.nanoTime();

        for (int i = 0; i < size; i++) {
            list.add(i);
        }

        long endTime = System.nanoTime();
        System.out.printf("   %s: %,.3f мс%n",
                name, (endTime - startTime) / 1_000_000.0);
    }


    private static void testAddToBeginning(List<Integer> list, int size, String name) {
        long startTime = System.nanoTime();

        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }

        long endTime = System.nanoTime();
        System.out.printf("   %s: %,.3f мс%n",
                name, (endTime - startTime) / 1_000_000.0);
    }


    private static void testInsertMiddle(List<Integer> list, int size, String name) {
        // Сначала заполняем коллекцию
        for (int i = 0; i < size; i++) {
            list.add(i);
        }

        Random random = new Random();
        long startTime = System.nanoTime();

        for (int i = 0; i < 1000; i++) {
            int index = list.size() / 2;
            list.add(index, random.nextInt());
        }

        long endTime = System.nanoTime();
        System.out.printf("   %s: %,.3f мс (1000 вставок)%n",
                name, (endTime - startTime) / 1_000_000.0);
    }


    private static void testSearch(List<Integer> list, int size, String name) {
        // Заполняем коллекцию
        for (int i = 0; i < size; i++) {
            list.add(i);
        }

        Random random = new Random();
        long startTime = System.nanoTime();


        for (int i = 0; i < 1000; i++) {
            int searchValue = random.nextInt(size);
            list.contains(searchValue);
        }

        long endTime = System.nanoTime();
        System.out.printf("   %s: %,.3f мс (1000 поисков)%n",
                name, (endTime - startTime) / 1_000_000.0);
    }


    private static void testRemoveFromBeginning(List<Integer> list, int size, String name) {

        for (int i = 0; i < size; i++) {
            list.add(i);
        }

        long startTime = System.nanoTime();


        while (!list.isEmpty()) {
            list.remove(0);
        }

        long endTime = System.nanoTime();
        System.out.printf("   %s: %,.3f мс%n",
                name, (endTime - startTime) / 1_000_000.0);
    }


    private static void testRemoveFromEnd(List<Integer> list, int size, String name) {

        for (int i = 0; i < size; i++) {
            list.add(i);
        }

        long startTime = System.nanoTime();


        while (!list.isEmpty()) {
            list.remove(list.size() - 1);
        }

        long endTime = System.nanoTime();
        System.out.printf("   %s: %,.3f мс%n",
                name, (endTime - startTime) / 1_000_000.0);
    }
}