package pract_8;

import java.util.Scanner;

public class Task11 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите последовательность чисел (завершается двумя нулями подряд): ");
        System.out.println("Количество единиц: " + countOnes(false));
        scanner.close();
    }

    public static int countOnes(boolean prevWasZero) {
        int num = scanner.nextInt();
        if (num == 0) {
            if (prevWasZero) {
                return 0;
            } else {
                return countOnes(true);
            }
        } else {
            int add = (num == 1) ? 1 : 0;
            return add + countOnes(false);
        }
    }
}