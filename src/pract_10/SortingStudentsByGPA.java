package pract_10;

import java.util.*;

public class SortingStudentsByGPA {
    private List<Student> iDNumber;

    public SortingStudentsByGPA() {
        iDNumber = new ArrayList<>();
    }


    public void setArray(List<Student> students) {
        iDNumber.clear();
        iDNumber.addAll(students);
    }


    public void quicksort() {
        quicksort(0, iDNumber.size() - 1);
    }

    private void quicksort(int low, int high) {
        if (low < high) {
            int pi = partition(low, high);
            quicksort(low, pi - 1);
            quicksort(pi + 1, high);
        }
    }

    private int partition(int low, int high) {
        Student pivot = iDNumber.get(high);
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (iDNumber.get(j).getAverageGrade() > pivot.getAverageGrade()) {
                i++;
                Collections.swap(iDNumber, i, j);
            }
        }
        Collections.swap(iDNumber, i + 1, high);
        return i + 1;
    }


    public void mergeSortByLastName() {
        iDNumber = mergeSort(iDNumber);
    }

    private List<Student> mergeSort(List<Student> list) {
        if (list.size() <= 1) return list;
        int mid = list.size() / 2;
        List<Student> left = mergeSort(list.subList(0, mid));
        List<Student> right = mergeSort(list.subList(mid, list.size()));
        return merge(left, right);
    }

    private List<Student> merge(List<Student> left, List<Student> right) {
        List<Student> merged = new ArrayList<>();
        int i = 0, j = 0;
        while (i < left.size() && j < right.size()) {
            if (left.get(i).getLastName().compareTo(right.get(j).getLastName()) <= 0) {
                merged.add(left.get(i++));
            } else {
                merged.add(right.get(j++));
            }
        }
        while (i < left.size()) merged.add(left.get(i++));
        while (j < right.size()) merged.add(right.get(j++));
        return merged;
    }


    public void outArray() {
        for (Student s : iDNumber) {
            System.out.println(s);
        }
    }
}