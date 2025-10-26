package ru.mirea.lab1;

public class Author {
    // Поля класса
    private String name;
    private String email;
    private char gender;

    // Конструктор
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    // Геттеры и сеттеры
    public String setName() {
        return name;
    }

    public String setEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char setGender() {
        return gender;
    }

    // Метод toString()
    @Override
    public String toString() {
        return "Author[name=" + name + ", email=" + email + ", gender=" + gender + "]";
    }
}
