package pract_4;

public class Phone {
    private String number;
    private String model;
    private double weight;

    // Конструктор с тремя параметрами
    public Phone(String number, String model, double weight) {
        this(number, model); // Вызов конструктора с двумя параметрами
        this.weight = weight;
    }

    // Конструктор с двумя параметрами
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
        this.weight = 0.0;
    }

    // Конструктор без параметров
    public Phone() {
        this("", "", 0.0);
    }

    // Метод receiveCall с одним параметром
    public void receiveCall(String callerName) {
        System.out.println("Звонит " + callerName);
    }

    // Перегруженный метод receiveCall с двумя параметрами
    public void receiveCall(String callerName, String callerNumber) {
        System.out.println("Звонит " + callerName + ", номер: " + callerNumber);
    }

    // Метод getNumber
    public String getNumber() {
        return number;
    }

    // Метод sendMessage с переменным числом аргументов
    public void sendMessage(String... phoneNumbers) {
        System.out.println("Сообщение будет отправлено на следующие номера:");
        for (String phoneNumber : phoneNumbers) {
            System.out.println(phoneNumber);
        }
    }

    // Геттеры и сеттеры
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}