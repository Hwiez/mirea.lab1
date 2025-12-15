package pract_12;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

// Абстрактный класс Shape
abstract class Shape {
    protected Color color;
    protected int x, y;

    public Shape(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public abstract void draw(Graphics g);
}

// Класс для круга
class Circle extends Shape {
    private int radius;

    public Circle(Color color, int x, int y, int radius) {
        super(color, x, y);
        this.radius = radius;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, radius * 2, radius * 2);
    }
}

// Класс для прямоугольника
class Rectangle extends Shape {
    private int width, height;

    public Rectangle(Color color, int x, int y, int width, int height) {
        super(color, x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}

// Основное окно
class RandomShapesWindow extends JFrame {
    private Shape[] shapes;

    public RandomShapesWindow() {
        super("20 Random Shapes");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        shapes = new Shape[20];
        Random random = new Random();

        // Создаем 20 случайных фигур
        for (int i = 0; i < shapes.length; i++) {
            Color color = new Color(
                    random.nextInt(256),
                    random.nextInt(256),
                    random.nextInt(256)
            );

            int x = random.nextInt(700);
            int y = random.nextInt(500);

            if (random.nextBoolean()) {
                // Круг
                int radius = 10 + random.nextInt(50);
                shapes[i] = new Circle(color, x, y, radius);
            } else {
                // Прямоугольник
                int width = 20 + random.nextInt(100);
                int height = 20 + random.nextInt(100);
                shapes[i] = new Rectangle(color, x, y, width, height);
            }
        }

        // Создаем панель для рисования
        JPanel drawingPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Рисуем все фигуры
                for (Shape shape : shapes) {
                    shape.draw(g);
                }
            }
        };

        drawingPanel.setBackground(Color.WHITE);
        add(drawingPanel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new RandomShapesWindow().setVisible(true);
        });
    }
}