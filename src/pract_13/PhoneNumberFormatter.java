package pract_13;

public class PhoneNumberFormatter {

    public static String formatPhoneNumber(String phone) {
        // Удаляем все нецифровые символы, кроме возможного плюса в начале
        String cleaned = phone.replaceAll("[^\\d+]", "");

        // Проверяем российский номер формата 8XXXXXXXXXX
        if (cleaned.startsWith("8") && cleaned.length() == 11) {
            // Заменяем 8 на +7
            cleaned = "+7" + cleaned.substring(1);
        }

        // Если номер начинается с + и имеет правильную длину
        if (cleaned.startsWith("+") && cleaned.length() >= 12) {
            String countryCode = "";
            String number = "";

            // Определяем длину кода страны (предполагаем, что код страны 1-3 цифры)
            int i = 1; // Пропускаем +
            while (i < cleaned.length() && Character.isDigit(cleaned.charAt(i))) {
                countryCode += cleaned.charAt(i);
                i++;
            }

            // Оставшаяся часть - номер
            number = cleaned.substring(i);

            // Проверяем, что номер содержит 10 цифр
            if (number.matches("\\d{10}")) {
                return String.format("+%s %s %s %s",
                        countryCode,
                        number.substring(0, 3),
                        number.substring(3, 6),
                        number.substring(6));
            }
        }

        return "Неверный формат номера";
    }

    public static void main(String[] args) {
        String[] testNumbers = {
                "+79175655655",
                "+104289652211",
                "89175655655",
                "+74951234567",
                "+123456789012"
        };

        System.out.println("=== Форматирование телефонных номеров ===");
        for (String number : testNumbers) {
            System.out.println(number + " -> " + formatPhoneNumber(number));
        }
    }
}