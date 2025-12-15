package pract_8;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число без нулей: ");
        int n = scanner.nextInt();
        System.out.println("Развёрнутое число: " + reverseNumber(n, 0));
        scanner.close();
    }

    public static int reverseNumber(int n, int reversed) {

        if (n == 0) {
            return reversed;
        }

        int lastDigit = n % 10;
        return reverseNumber(n / 10, reversed * 10 + lastDigit);
    }
}