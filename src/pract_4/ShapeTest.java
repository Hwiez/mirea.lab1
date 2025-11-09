package pract_4;

public class ShapeTest {
    public static void main(String[] args) {
        // Создаем объекты разных фигур
        Shape shape1 = new Circle(5.0, "Red", true);
        Shape shape2 = new Rectangle(4.0, 6.0, "Blue", false);
        Shape shape3 = new Square(3.0, "Green", true);

        // Создаем массив фигур
        Shape[] shapes = {shape1, shape2, shape3};

        // Цикл for-each для перебора всех фигур
        for (Shape shape : shapes) {

            System.out.println("Type: " + shape.getType());
            System.out.println("Area: " + shape.getArea());
            System.out.println("Perimeter: " + shape.getPerimeter());
            System.out.println(shape.toString());
            System.out.println("---------------");
        }
    }
}