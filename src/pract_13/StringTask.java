package pract_13;

public class StringTask {
    public static void main(String[] args) {
        String str = "I like Java!!";

        // 2. Распечатать последний символ строки
        System.out.println("Последний символ: " + str.charAt(str.length() - 1));

        // 3. Проверить, заканчивается ли строка подстрокой "!!!"
        System.out.println("Заканчивается на '!!!': " + str.endsWith("!!!"));

        // 4. Проверить, начинается ли строка подстрокой "I like"
        System.out.println("Начинается на 'I like': " + str.startsWith("I like"));

        // 5. Проверить, содержит ли строка подстроку "Java"
        System.out.println("Содержит 'Java': " + str.contains("Java"));

        // 6. Найти позицию подстроки "Java" в строке
        System.out.println("Позиция 'Java': " + str.indexOf("Java"));

        // 7. Заменить все символы "a" на "o"
        String replaced = str.replace('a', 'o');
        System.out.println("После замены 'a' на 'o': " + replaced);

        // 8. Преобразовать строку к верхнему регистру
        System.out.println("Верхний регистр: " + str.toUpperCase());

        // 9. Преобразовать строку к нижнему регистру
        System.out.println("Нижний регистр: " + str.toLowerCase());

        // 10. Вырезать строку Java
        int start = str.indexOf("Java");
        int end = start + "Java".length();
        System.out.println("Вырезанная 'Java': " + str.substring(start, end));
    }
}