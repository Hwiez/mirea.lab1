package pract_12;

import javax.swing.*;
import java.io.File;

public class SpriteAnimation extends JFrame {
    private ImageIcon[] sprites;
    private int currentFrame = 0;

    public SpriteAnimation() {
        setTitle("Бегущий человек");
        setSize(300, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Автоматический поиск папки со спрайтами
        String currentDir = System.getProperty("user.dir");
        String spritesPath = currentDir + "/sprites";

        System.out.println("Ищем спрайты в: " + spritesPath);

        File folder = new File(spritesPath);
        if (!folder.exists()) {
            System.err.println("Ошибка: Папка 'sprites' не найдена!");
            System.err.println("Создайте папку 'sprites' рядом с проектом");
            System.err.println("Текущая директория: " + currentDir);
            return;
        }

        // Загрузка спрайтов
        File[] files = folder.listFiles();
        if (files == null || files.length == 0) {
            System.err.println("Нет файлов в папке 'sprites'");
            return;
        }

        // Фильтруем только изображения
        java.util.ArrayList<File> imageFiles = new java.util.ArrayList<>();
        for (File file : files) {
            String name = file.getName().toLowerCase();
            if (name.endsWith(".png") || name.endsWith(".jpg") || name.endsWith(".jpeg")) {
                imageFiles.add(file);
            }
        }

        // Сортируем по имени
        imageFiles.sort(java.util.Comparator.comparing(File::getName));

        sprites = new ImageIcon[imageFiles.size()];
        for (int i = 0; i < imageFiles.size(); i++) {
            sprites[i] = new ImageIcon(imageFiles.get(i).getAbsolutePath());
        }

        // Отображение
        JLabel label = new JLabel(sprites[0]);
        add(label);

        // Таймер анимации
        new Timer(150, e -> {
            currentFrame = (currentFrame + 1) % sprites.length;
            label.setIcon(sprites[currentFrame]);
        }).start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new SpriteAnimation().setVisible(true);
        });
    }
}