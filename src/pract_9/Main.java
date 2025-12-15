package pract_9;

import java.util.*;


class Student implements Comparable<Student> {
    private int iDNumber;
    private String name;
    private double gpa;

    public Student(int iDNumber, String name, double gpa) {
        this.iDNumber = iDNumber;
        this.name = name;
        this.gpa = gpa;
    }

    public int getIDNumber() {
        return iDNumber;
    }

    public double getGPA() {
        return gpa;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.iDNumber, other.iDNumber);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + iDNumber +
                ", name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}


class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s2.getGPA(), s1.getGPA()); // по убыванию
    }

    // Быстрая сортировка (Quick Sort) для списка студентов
    public void quickSort(List<Student> students, int low, int high) {
        if (low < high) {
            int pi = partition(students, low, high);
            quickSort(students, low, pi - 1);
            quickSort(students, pi + 1, high);
        }
    }

    private int partition(List<Student> students, int low, int high) {
        Student pivot = students.get(high);
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (compare(students.get(j), pivot) < 0) {
                i++;
                Collections.swap(students, i, j);
            }
        }
        Collections.swap(students, i + 1, high);
        return i + 1;
    }
}


class InsertionSort {
    public static void sort(Student[] array) {
        for (int i = 1; i < array.length; i++) {
            Student key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j].compareTo(key) > 0) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }
}


class MergeSort {
    public static List<Student> mergeSort(List<Student> list1, List<Student> list2) {
        List<Student> merged = new ArrayList<>();
        merged.addAll(list1);
        merged.addAll(list2);
        mergeSortInternal(merged, 0, merged.size() - 1);
        return merged;
    }

    private static void mergeSortInternal(List<Student> list, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSortInternal(list, left, mid);
            mergeSortInternal(list, mid + 1, right);
            merge(list, left, mid, right);
        }
    }

    private static void merge(List<Student> list, int left, int mid, int right) {
        List<Student> leftList = new ArrayList<>(list.subList(left, mid + 1));
        List<Student> rightList = new ArrayList<>(list.subList(mid + 1, right + 1));

        int i = 0, j = 0, k = left;
        while (i < leftList.size() && j < rightList.size()) {
            if (leftList.get(i).compareTo(rightList.get(j)) <= 0) {
                list.set(k++, leftList.get(i++));
            } else {
                list.set(k++, rightList.get(j++));
            }
        }

        while (i < leftList.size()) {
            list.set(k++, leftList.get(i++));
        }
        while (j < rightList.size()) {
            list.set(k++, rightList.get(j++));
        }
    }
}


public class Main {
    public static void main(String[] args) {
        // Задание 1: Сортировка вставками по iDNumber
        System.out.println("=== Задание 1: Сортировка вставками ===");
        Student[] students1 = {
                new Student(103, "Анна", 4.2),
                new Student(101, "Иван", 4.8),
                new Student(102, "Мария", 4.5)
        };
        InsertionSort.sort(students1);
        for (Student s : students1) {
            System.out.println(s);
        }

        // Задание 2: Сортировка по GPA (быстрая сортировка)
        System.out.println("\n=== Задание 2: Быстрая сортировка по GPA ===");
        List<Student> students2 = new ArrayList<>(Arrays.asList(
                new Student(1, "Алексей", 3.9),
                new Student(2, "Ольга", 4.7),
                new Student(3, "Дмитрий", 4.1)
        ));
        SortingStudentsByGPA sorter = new SortingStudentsByGPA();
        sorter.quickSort(students2, 0, students2.size() - 1);
        for (Student s : students2) {
            System.out.println(s);
        }

        // Задание 3: Слияние двух списков с сортировкой слиянием
        System.out.println("\n=== Задание 3: Сортировка слиянием двух списков ===");
        List<Student> list1 = Arrays.asList(
                new Student(10, "Петр", 4.0),
                new Student(30, "Светлана", 4.3)
        );
        List<Student> list2 = Arrays.asList(
                new Student(20, "Андрей", 4.1),
                new Student(40, "Екатерина", 4.9)
        );
        List<Student> merged = MergeSort.mergeSort(list1, list2);
        for (Student s : merged) {
            System.out.println(s);
        }

        // Задание 4: Демонстрация работы Comparable (сортировка через Collections.sort)
        System.out.println("\n=== Задание 4: Сортировка через Comparable ===");
        List<Student> students4 = new ArrayList<>(Arrays.asList(
                new Student(300, "Николай", 3.8),
                new Student(100, "Татьяна", 4.4),
                new Student(200, "Сергей", 4.0)
        ));
        Collections.sort(students4); // использует compareTo (по id)
        for (Student s : students4) {
            System.out.println(s);
        }
    }
}