package pract_13;

public class Person {
    private String lastName;
    private String firstName;
    private String middleName;

    public Person(String lastName, String firstName, String middleName) {
        this.lastName = lastName != null ? lastName.trim() : "";
        this.firstName = firstName != null ? firstName.trim() : "";
        this.middleName = middleName != null ? middleName.trim() : "";
    }

    public Person(String lastName) {
        this(lastName, null, null);
    }

    public Person(String lastName, String firstName) {
        this(lastName, firstName, null);
    }

    public String getFullName() {
        StringBuilder sb = new StringBuilder(lastName);

        if (!firstName.isEmpty()) {
            sb.append(" ");
            // Берем только первую букву имени
            sb.append(firstName.charAt(0)).append(".");
        }

        if (!middleName.isEmpty()) {
            // Берем только первую букву отчества
            sb.append(middleName.charAt(0)).append(".");
        }

        return sb.toString();
    }

    // Для быстродействия используем StringBuilder и избегаем лишних проверок
    public String getFullNameOptimized() {
        if (lastName.isEmpty()) {
            return "";
        }

        StringBuilder sb = new StringBuilder(lastName);

        if (!firstName.isEmpty()) {
            sb.append(' ').append(firstName.charAt(0)).append('.');
            if (!middleName.isEmpty()) {
                sb.append(middleName.charAt(0)).append('.');
            }
        } else if (!middleName.isEmpty()) {
            sb.append(' ').append(middleName.charAt(0)).append('.');
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Person p1 = new Person("Иванов", "Иван", "Иванович");
        Person p2 = new Person("Петров", "Петр");
        Person p3 = new Person("Сидоров");
        Person p4 = new Person("Кузнецов", "", "Алексеевич");

        System.out.println(p1.getFullNameOptimized());
        System.out.println(p2.getFullNameOptimized());
        System.out.println(p3.getFullNameOptimized());
        System.out.println(p4.getFullNameOptimized());
    }
}