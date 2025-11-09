package pract_5;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
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

// Класс Circle
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

// Класс Rectangle
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

// Панель для отрисовки фигур
class ShapesPanel extends JPanel {
    private List<Shape> shapes;
    private Random random;

    public ShapesPanel() {
        shapes = new ArrayList<>();
        random = new Random();
        generateShapes();
    }

    private void generateShapes() {
        for (int i = 0; i < 20; i++) {
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            int x = random.nextInt(600);
            int y = random.nextInt(400);

            if (random.nextBoolean()) {
                int radius = 10 + random.nextInt(40);
                shapes.add(new Circle(color, x, y, radius));
            } else {
                int width = 20 + random.nextInt(80);
                int height = 20 + random.nextInt(80);
                shapes.add(new Rectangle(color, x, y, width, height));
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }
}


