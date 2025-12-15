package pract_13;

public class AddressTest {
    public static void main(String[] args) {
        String[] addresses = {
                "Россия, Московская область, Москва, Тверская, 10, 1, 15",
                "США, Калифорния, Лос-Анджелес, Сансет-бульвар, 123, A, 45",
                "Германия, Бавария, Мюнхен, Мариенплац, 5, , 3",
                "Франция, Иль-де-Франс, Париж, Елисейские Поля, 25, B, 7"
        };

        System.out.println("=== Разбор с использованием split() ===");
        for (int i = 0; i < addresses.length; i++) {
            System.out.println("\nАдрес " + (i + 1) + ":");
            Address addr = new Address();
            addr.parseWithSplit(addresses[i]);
            System.out.println(addr);
        }

        System.out.println("\n=== Разбор с использованием StringTokenizer ===");
        for (int i = 0; i < addresses.length; i++) {
            System.out.println("\nАдрес " + (i + 1) + ":");
            Address addr = new Address();
            addr.parseWithTokenizer(addresses[i]);
            System.out.println(addr);
        }
    }
}