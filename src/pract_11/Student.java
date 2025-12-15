package pract_11;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Student {
    private String name;
    private int age;
    private Date birthDate;

    public Student(String name, int age, Date birthDate) {
        this.name = name;
        this.age = age;
        this.birthDate = birthDate;
    }


    public String formatBirthDate(String formatType) {
        SimpleDateFormat sdf;

        switch(formatType.toLowerCase()) {
            case "краткий":
                sdf = new SimpleDateFormat("dd.MM.yy");
                break;
            case "средний":
                sdf = new SimpleDateFormat("dd MMM yyyy");
                break;
            case "полный":
                sdf = new SimpleDateFormat("dd MMMM yyyy года, EEEE");
                break;
            default:
                sdf = new SimpleDateFormat("dd.MM.yyyy");
        }

        return sdf.format(birthDate);
    }

    @Override
    public String toString() {
        return "Student{name='" + name +
                "', age=" + age +
                ", birthDate=" + formatBirthDate("средний") + "}";
    }


    public static void main(String[] args) {
        Student student = new Student("Петров Иван", 20, new Date(95, 4, 15)); // 15 мая 1995

        System.out.println("Краткий формат: " + student.formatBirthDate("краткий"));
        System.out.println("Средний формат: " + student.formatBirthDate("средний"));
        System.out.println("Полный формат: " + student.formatBirthDate("полный"));
        System.out.println("\nМетод toString(): " + student);
    }
}