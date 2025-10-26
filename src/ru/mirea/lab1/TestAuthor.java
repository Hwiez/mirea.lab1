package ru.mirea.lab1;

public class TestAuthor {
    public static void main(String[] args) {
        // Создание объекта Author
        Author author = new Author("Рэй Брэдбери", "bradbury@example.com", 'M');

        // Вывод информации об авторе
        System.out.println(author.toString());

        // Изменение email
        author.setEmail("new_turgenev@example.com");

        // Вывод обновленной информации
        System.out.println("Новый email: " + author.setEmail());
        System.out.println("Имя автора: " + author.setName());
        System.out.println("Пол: " + author.setGender());
    }
}
