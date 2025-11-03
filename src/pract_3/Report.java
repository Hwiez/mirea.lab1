package pract_3;

class Report {
    public static void generateReport(Employee[] employees) {
        System.out.println("Отчет по зарплатам сотрудников:");
        System.out.println(" ");
        System.out.printf("%-20s %15s%n", "ФИО сотрудника", "Зарплата");
        System.out.println("------------------------------");

        for (Employee emp : employees) {
            System.out.printf("%-20s %15.2f руб.%n", emp.fullname, emp.salary);
        }

        // Дополнительная статистика
        double total = 0;
        for (Employee emp : employees) {
            total += emp.salary;
        }
        System.out.println("------------------------------");
        System.out.printf("%-20s %15.2f руб.%n", "Общий фонд:", total);
        System.out.printf("%-20s %15.2f руб.%n", "Средняя зарплата:",
                total / employees.length);
    }
}