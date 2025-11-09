package pract_5;

import javax.swing.*;
import java.awt.*;

public class SimpleAnimation extends JPanel {
    private boolean isRed = true;

    public SimpleAnimation() {
        // Создаем таймер который меняет цвет каждые 500 мс
        Timer timer = new Timer(500, e -> {
            isRed = !isRed; // меняем цвет
            repaint(); // перерисовываем
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Рисуем квадрат который меняет цвет
        if (isRed) {
            g.setColor(Color.RED);
        } else {
            g.setColor(Color.BLUE);
        }
        g.fillRect(50, 50, 100, 100);

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Моя анимация");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 250);
        frame.setLocationRelativeTo(null);

        SimpleAnimation animation = new SimpleAnimation();
        frame.add(animation);

        frame.setVisible(true);
    }
}
