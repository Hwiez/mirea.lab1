package pract_3;

public class FormattingTask {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Иванов И.И.", 45000.50656),
                new Employee("Петров П.П.", 52600.754),
                new Employee("Сидорова С.С.", 48000.256),
                new Employee("Кузнецов К.К.", 61600.00)
        };

        Report.generateReport(employees);
    }
}