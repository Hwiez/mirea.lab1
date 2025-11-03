package pract_3;
import java.util.Arrays;
import java.util.Random;

public class pract3_1 {
    public static void main(String[] args) {
        int size = 5;
        double[] array1 = new double[size];
        double[] array2 = new double[size];

        // Заполнение массива через Math.random()
        for (int i = 0; i < size; i++) {
            array1[i] = Math.random() * 100;
        }

        // Заполнение массива через класс Random
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            array2[i] = rand.nextDouble() * 100;
        }

        System.out.println("Массив 1 (Math.random()): " + Arrays.toString(array1));
        System.out.println("Массив 2 (Random class): " + Arrays.toString(array2));

        Arrays.sort(array1);
        Arrays.sort(array2);

        System.out.println("Отсортированный массив 1: " + Arrays.toString(array1));
        System.out.println("Отсортированный массив 2: " + Arrays.toString(array2));
    }
}
