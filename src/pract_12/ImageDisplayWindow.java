package pract_12;

import javax.swing.*;
import java.awt.*;
import java.io.File;

class ImageDisplayWindow extends JFrame {

    public ImageDisplayWindow(String imagePath) {
        super("Image Display");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Проверяем существование файла
        File file = new File(imagePath);
        if (!file.exists()) {
            JOptionPane.showMessageDialog(this,
                    "Файл не найден: " + imagePath,
                    "Ошибка",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            // Загружаем изображение
            ImageIcon imageIcon = new ImageIcon(imagePath);

            // Масштабируем изображение если оно слишком большое
            Image image = imageIcon.getImage();
            Image scaledImage = image.getScaledInstance(600, 400, Image.SCALE_SMOOTH);
            imageIcon = new ImageIcon(scaledImage);

            JLabel imageLabel = new JLabel(imageIcon);
            imageLabel.setHorizontalAlignment(SwingConstants.CENTER);

            // Панель для информации
            JPanel infoPanel = new JPanel();
            infoPanel.add(new JLabel("Путь к изображению: " + imagePath));

            add(infoPanel, BorderLayout.NORTH);
            add(imageLabel, BorderLayout.CENTER);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Ошибка при загрузке изображения: " + e.getMessage(),
                    "Ошибка",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Использование: java ImageDisplayWindow <путь_к_изображению>");
            return;
        }

        SwingUtilities.invokeLater(() -> {
            new ImageDisplayWindow(args[0]).setVisible(true);
        });
    }
}