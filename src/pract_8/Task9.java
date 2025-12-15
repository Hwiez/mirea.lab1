package pract_8;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество нулей (a): ");
        int a = scanner.nextInt();
        System.out.print("Введите количество единиц (b): ");
        int b = scanner.nextInt();
        System.out.println("Количество последовательностей: " + countSequences(a, b));
        scanner.close();
    }

    public static int countSequences(int a, int b) {

        if (a == 0 && b >= 0) {
            return 1;
        }
        if (a > b + 1 || a < 0 || b < 0) {
            return 0;
        }
        return countSequences(a, b - 1) + countSequences(a - 1, b - 1);
    }
}