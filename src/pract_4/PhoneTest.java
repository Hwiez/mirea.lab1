package pract_4;

public class PhoneTest {
    public static void main(String[] args) {
        // Создание трех объектов Phone
        Phone phone1 = new Phone("+79123456789", "iPhone 13", 0.174);
        Phone phone2 = new Phone("+79234567890", "Samsung Galaxy", 0.168);
        Phone phone3 = new Phone("+79345678901", "Xiaomi Mi", 0.185);

        // Вывод информации о телефонах
        Phone[] phones = {phone1, phone2, phone3};
        for (Phone phone : phones) {
            System.out.println("Номер: " + phone.getNumber() +
                    ", Модель: " + phone.getModel() +
                    ", Вес: " + phone.getWeight() + "кг");
        }

        System.out.println("\n--- Тестирование методов ---");

        // Вызов методов receiveCall
        phone1.receiveCall("Анна");
        phone2.receiveCall("Петр", "+79876543210");

        // Вызов метода getNumber
        System.out.println("Номер первого телефона: " + phone1.getNumber());

        // Вызов метода sendMessage
        phone3.sendMessage("+79111111111", "+79222222222", "+79333333333");
    }
}